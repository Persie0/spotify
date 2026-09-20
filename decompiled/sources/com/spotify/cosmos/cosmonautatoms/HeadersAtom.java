package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.annotations.Header;
import com.spotify.cosmos.cosmonaut.annotations.HeaderMap;
import com.spotify.cosmos.cosmonaut.annotations.Headers;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.nau;
import p204p.s571;
import p204p.wj50;
import p204p.wl51;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/HeadersAtom;", "", "method", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "staticHeaders", "", "", "dynamicHeadersIndex", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Header;", "dynamicHeaderMapsIndex", "Lcom/spotify/cosmos/cosmonaut/annotations/HeaderMap;", "call", "args", "", "([Ljava/lang/Object;)Ljava/util/Map;", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HeadersAtom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<IndexedAnnotation<HeaderMap>> dynamicHeaderMapsIndex;
    private final List<IndexedAnnotation<Header>> dynamicHeadersIndex;
    private final Map<String, String> staticHeaders;

    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\b\u001a\u00020\t¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/HeadersAtom$Companion;", "", "<init>", "()V", "createDynamicHeadersIndex", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Header;", "method", "Ljava/lang/reflect/Method;", "createDynamicHeaderMapsIndex", "Lcom/spotify/cosmos/cosmonaut/annotations/HeaderMap;", "convertHeaderArg", "", "name", "arg", "createHeaders", "", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<IndexedAnnotation<HeaderMap>> createDynamicHeaderMapsIndex(Method method) {
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
                HeaderMap headerMap = (HeaderMap) companion.findAnnotation(annotationArr, HeaderMap.class);
                IndexedAnnotation indexedAnnotation = headerMap == null ? null : new IndexedAnnotation(headerMap, i2);
                if (indexedAnnotation != null) {
                    arrayList.add(indexedAnnotation);
                }
                i++;
                i2 = i3;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<IndexedAnnotation<Header>> createDynamicHeadersIndex(Method method) {
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
                Header header = (Header) companion.findAnnotation(annotationArr, Header.class);
                IndexedAnnotation indexedAnnotation = header == null ? null : new IndexedAnnotation(header, i2);
                if (indexedAnnotation != null) {
                    arrayList.add(indexedAnnotation);
                }
                i++;
                i2 = i3;
            }
            return arrayList;
        }

        public final String convertHeaderArg(String name, Object arg) {
            if (arg instanceof String) {
                return (String) arg;
            }
            if (arg instanceof Number) {
                return ((Number) arg).toString();
            }
            if (arg == null) {
                throw new IllegalArgumentException(s571.m77251j("@Header argument ", name, " is null"));
            }
            throw new IllegalArgumentException(edb.m38566o("@Header argument ", name, " has unsupported type: ", arg.getClass().getName()));
        }

        public final Map<String, String> createHeaders(Method method) {
            Headers headers = (Headers) method.getAnnotation(Headers.class);
            if (headers == null) {
                return nau.f152117a;
            }
            String[] strArrValue = headers.value();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : strArrValue) {
                int iM88457G0 = wl51.m88457G0(str, ':', 0, 6);
                if (iM88457G0 == -1 || iM88457G0 == 0 || iM88457G0 == str.length() - 1) {
                    throw new IllegalArgumentException(s571.m77250i(edb.m38564m("\"", str), "\" is not in the form \"Name: Value\""));
                }
                String strSubstring = str.substring(0, iM88457G0);
                String string = wl51.m88491o1(str.substring(iM88457G0 + 1)).toString();
                if (string.length() == 0) {
                    throw new IllegalArgumentException(s571.m77250i("\"".concat(strSubstring), "\" valuer is empty"));
                }
                linkedHashMap.put(strSubstring, string);
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    public HeadersAtom(Method method) {
        Companion companion = INSTANCE;
        this.staticHeaders = companion.createHeaders(method);
        this.dynamicHeadersIndex = companion.createDynamicHeadersIndex(method);
        this.dynamicHeaderMapsIndex = companion.createDynamicHeaderMapsIndex(method);
    }

    public final Map<String, String> call(Object[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.staticHeaders);
        for (IndexedAnnotation<Header> indexedAnnotation : this.dynamicHeadersIndex) {
            if (args == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj = args[indexedAnnotation.getIndex()];
            String strValue = ((Header) indexedAnnotation.getAnnot()).value();
            linkedHashMap.put(strValue, INSTANCE.convertHeaderArg(strValue, obj));
        }
        for (IndexedAnnotation<HeaderMap> indexedAnnotation2 : this.dynamicHeaderMapsIndex) {
            if (args == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj2 = args[indexedAnnotation2.getIndex()];
            if (obj2 == null) {
                throw new IllegalArgumentException("@HeaderMap argument is null");
            }
            if (!(obj2 instanceof Map)) {
                throw new IllegalArgumentException("@HeaderMap argument is not a java.util.Map");
            }
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                String strValueOf = String.valueOf(entry.getKey());
                linkedHashMap.put(strValueOf, INSTANCE.convertHeaderArg(strValueOf, entry.getValue()));
            }
        }
        return linkedHashMap;
    }
}
