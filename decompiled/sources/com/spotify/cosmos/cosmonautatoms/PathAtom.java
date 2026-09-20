package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.PUT;
import com.spotify.cosmos.cosmonaut.annotations.Path;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.cln0;
import p204p.edb;
import p204p.ife;
import p204p.mif1;
import p204p.s571;
import p204p.tka1;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\f\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/PathAtom;", "", "method", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "namedPathIndex", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Path;", "uri", "", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/String;", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PathAtom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<IndexedAnnotation<Path>> namedPathIndex;
    private final String uri;

    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/PathAtom$Companion;", "", "<init>", "()V", "createNamedPathIndex", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Path;", "method", "Ljava/lang/reflect/Method;", "parseUri", "", "annot", "", "convertPathArg", "name", "arg", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<IndexedAnnotation<Path>> createNamedPathIndex(Method method) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            wj50.m88279p(parameterAnnotations);
            ArrayList arrayList = new ArrayList();
            int length = parameterAnnotations.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                Annotation[] annotationArr = parameterAnnotations[i];
                ReflectionUtil.Companion companion = ReflectionUtil.INSTANCE;
                wj50.m88279p(annotationArr);
                Path path = (Path) companion.findAnnotation(annotationArr, Path.class);
                IndexedAnnotation indexedAnnotation = path == null ? null : new IndexedAnnotation(path, i2);
                if (indexedAnnotation != null) {
                    arrayList.add(indexedAnnotation);
                }
                i++;
                i2 = i3;
            }
            return arrayList;
        }

        public final String convertPathArg(String name, Object arg) {
            if (arg instanceof String) {
                return (String) arg;
            }
            if (arg instanceof Number) {
                return ((Number) arg).toString();
            }
            if (arg == null) {
                throw new IllegalArgumentException(s571.m77251j("@Path argument ", name, " is null"));
            }
            throw new IllegalArgumentException(edb.m38566o("@Path argument ", name, " has unsupported type: ", arg.getClass().getName()));
        }

        public final String parseUri(Annotation annot) {
            if (annot instanceof GET) {
                return ((GET) annot).value();
            }
            if (annot instanceof POST) {
                return ((POST) annot).value();
            }
            if (annot instanceof SUB) {
                return ((SUB) annot).value();
            }
            if (annot instanceof DELETE) {
                return ((DELETE) annot).value();
            }
            if (annot instanceof PUT) {
                return ((PUT) annot).value();
            }
            throw new IllegalArgumentException(((ife) mif1.m61883r(annot)).mo28587A().toString());
        }

        private Companion() {
        }
    }

    public PathAtom(Method method) {
        Companion companion = INSTANCE;
        this.namedPathIndex = companion.createNamedPathIndex(method);
        this.uri = companion.parseUri(ReflectionUtil.INSTANCE.findActionAnnotation(method));
    }

    public final String call(Object[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cln0 cln0Var = tka1.f221113b;
        for (IndexedAnnotation<Path> indexedAnnotation : this.namedPathIndex) {
            String strValue = ((Path) indexedAnnotation.getAnnot()).value();
            if (args == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strConvertPathArg = INSTANCE.convertPathArg(strValue, args[indexedAnnotation.getIndex()]);
            if (!((Path) indexedAnnotation.getAnnot()).encoded()) {
                strConvertPathArg = cln0Var.m33285M(strConvertPathArg);
            }
            linkedHashMap.put(strValue, strConvertPathArg);
        }
        StringBuilder sb = new StringBuilder(this.uri);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String strM77250i = s571.m77250i(edb.m38564m("{", (String) entry.getKey()), "}");
            int iIndexOf = sb.indexOf(strM77250i);
            sb.replace(iIndexOf, strM77250i.length() + iIndexOf, (String) entry.getValue());
        }
        return sb.toString();
    }
}
