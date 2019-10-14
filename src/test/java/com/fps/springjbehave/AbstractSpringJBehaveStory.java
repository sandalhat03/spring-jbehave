package com.fps.springjbehave;

import static org.jbehave.core.reporters.Format.HTML;
import static org.jbehave.core.reporters.Format.IDE_CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryLoader;
import org.jbehave.core.io.StoryPathResolver;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.FilePrintStreamFactory.ResolveToPackagedName;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.ParameterControls;
import org.jbehave.core.steps.spring.SpringStepsFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestContextManager;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

public abstract class AbstractSpringJBehaveStory extends JUnitStory {

	
	@Autowired
    private ApplicationContext applicationContext;

	private TestContextManager testContextManager;
	

    public AbstractSpringJBehaveStory() {
    	super();
    	JUnitReportingRunner.recommendedControls(configuredEmbedder());
    }

    
    @Override
    public Configuration configuration() {
    	try {
            this.testContextManager = new TestContextManager(getClass());
            this.testContextManager.prepareTestInstance(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    	
        return new MostUsefulConfiguration()
                .useStoryPathResolver(storyPathResolver())
                .useStoryLoader(storyLoader())
                .useStoryReporterBuilder(storyReporterBuilder())
                .useParameterControls(parameterControls());
    }

    
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new SpringStepsFactory(configuration(), applicationContext);
    }
    

    private ParameterControls parameterControls() {
        return new ParameterControls()
                .useDelimiterNamedParameters(true);
    }

    
    private StoryPathResolver storyPathResolver() {
        return new UnderscoredCamelCaseResolver();
    }

    
    private StoryLoader storyLoader() {
        return new LoadFromClasspath();
    }
    

    private StoryReporterBuilder storyReporterBuilder() {
        return new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(this.getClass()))
                .withPathResolver(new ResolveToPackagedName())
                .withFailureTrace(true)
                .withDefaultFormats()
                .withFormats(IDE_CONSOLE, TXT, HTML);
    }

}
