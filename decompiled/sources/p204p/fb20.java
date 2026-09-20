package p204p;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface fb20 {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
