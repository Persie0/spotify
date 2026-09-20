package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.PUT;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ife;
import p204p.mif1;
import p204p.s601;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ReflectionUtil;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ReflectionUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Class<? extends Annotation>> ACTIONS = s601.m77310m0(GET.class, POST.class, SUB.class, DELETE.class, PUT.class);

    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006H\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/ReflectionUtil$Companion;", "", "<init>", "()V", "ACTIONS", "", "Ljava/lang/Class;", "", "findAnnotation", "T", "parameterAnnotations", "", "type", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/Object;", "findAction", "", "method", "Ljava/lang/reflect/Method;", "findActionAnnotation", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String findAction(Method method) {
            return ((ife) mif1.m61883r(findActionAnnotation(method))).mo28587A().getSimpleName();
        }

        public final Annotation findActionAnnotation(Method method) {
            Annotation[] annotations = method.getAnnotations();
            wj50.m88279p(annotations);
            for (Annotation annotation : annotations) {
                if (ReflectionUtil.ACTIONS.contains(((ife) mif1.m61883r(annotation)).mo28587A())) {
                    return annotation;
                }
            }
            throw new IllegalArgumentException(method.toString() + " does not declare one of " + ReflectionUtil.ACTIONS + ", found " + Arrays.toString(annotations));
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.annotation.Annotation] */
        public final <T> T findAnnotation(Annotation[] parameterAnnotations, Class<T> type) {
            for (Annotation annotation : parameterAnnotations) {
                ?? r2 = (T) annotation;
                if (type.isAssignableFrom(((ife) mif1.m61883r(r2)).mo28587A())) {
                    return r2;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private ReflectionUtil() {
    }

    public static final String findAction(Method method) {
        return INSTANCE.findAction(method);
    }

    public static final Annotation findActionAnnotation(Method method) {
        return INSTANCE.findActionAnnotation(method);
    }

    public static final <T> T findAnnotation(Annotation[] annotationArr, Class<T> cls) {
        return (T) INSTANCE.findAnnotation(annotationArr, cls);
    }
}
