package com.justeat.processor;

import com.google.auto.service.AutoService;
import com.justeat.annotation.Merge;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@AutoService(Processor.class)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes({
        "com.justeat.annotation.Merge",
        "com.justeat.annotation.Replace"
})
public class ModuleProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {

    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }
}
