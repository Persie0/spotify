package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.BodyPart;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2244p5;
import p204p.hzq0;
import p204p.qh00;
import p204p.uh00;
import p204p.wj50;
import p204p.xul0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/BodyAtom;", "", "Ljava/lang/reflect/Method;", "method", "Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "transformers", "<init>", "(Ljava/lang/reflect/Method;Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;)V", "Lp/xul0;", "Lp/uh00;", "", "", "createOptionalArgumentTransformer", "(Ljava/lang/reflect/Method;Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;)Lp/xul0;", "args", "call", "([Ljava/lang/Object;)[B", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "getTransformers", "()Lcom/spotify/cosmos/cosmonautatoms/RequestTransformers;", "argumentTransformation", "Lp/xul0;", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BodyAtom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] DEFAULT_VALUE = new byte[0];
    private final xul0 argumentTransformation;
    private final Method method;
    private final RequestTransformers transformers;

    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/BodyAtom$Companion;", "", "<init>", "()V", "DEFAULT_VALUE", "", "getDEFAULT_VALUE$src_main_java_com_spotify_cosmos_cosmonautatoms_cosmonautatoms", "()[B", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDEFAULT_VALUE$src_main_java_com_spotify_cosmos_cosmonautatoms_cosmonautatoms */
        public final byte[] m8156x70f9eb66() {
            return BodyAtom.DEFAULT_VALUE;
        }

        private Companion() {
        }
    }

    public BodyAtom(Method method, RequestTransformers requestTransformers) {
        this.method = method;
        this.transformers = requestTransformers;
        this.argumentTransformation = createOptionalArgumentTransformer(method, requestTransformers);
    }

    private final xul0 createOptionalArgumentTransformer(Method method, RequestTransformers transformers) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        wj50.m88279p(parameterAnnotations);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Annotation[] annotationArr = parameterAnnotations[i];
            ReflectionUtil.Companion companion = ReflectionUtil.INSTANCE;
            wj50.m88279p(annotationArr);
            if (((Body) companion.findAnnotation(annotationArr, Body.class)) != null) {
                Type type = method.getGenericParameterTypes()[i];
                wj50.m88279p(type);
                return new hzq0(new BodyTransformation(i, type, transformers.find(type)));
            }
        }
        ArrayList arrayList = new ArrayList(1);
        int length2 = parameterAnnotations.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Annotation[] annotationArr2 = parameterAnnotations[i2];
            ReflectionUtil.Companion companion2 = ReflectionUtil.INSTANCE;
            wj50.m88279p(annotationArr2);
            BodyPart bodyPart = (BodyPart) companion2.findAnnotation(annotationArr2, BodyPart.class);
            if (bodyPart != null) {
                arrayList.add(new PartArgument(bodyPart.value(), i2));
            }
        }
        return arrayList.isEmpty() ? C2244p5.f174033a : new hzq0(new BodyPartTransformation(arrayList, transformers.find(Map.class)));
    }

    public final byte[] call(final Object[] args) {
        return (byte[]) this.argumentTransformation.mo49284i(new qh00() { // from class: com.spotify.cosmos.cosmonautatoms.BodyAtom.call.1
            @Override // p204p.qh00
            public final byte[] apply(uh00 uh00Var) {
                if (uh00Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Object[] objArr = args;
                if (objArr != null) {
                    return (byte[]) uh00Var.apply(objArr);
                }
                throw new IllegalStateException("Required value was null.");
            }
        }).mo49280e(DEFAULT_VALUE);
    }

    public final Method getMethod() {
        return this.method;
    }

    public final RequestTransformers getTransformers() {
        return this.transformers;
    }
}
