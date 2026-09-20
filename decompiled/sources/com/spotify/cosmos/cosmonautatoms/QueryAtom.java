package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.annotations.Query;
import com.spotify.cosmos.cosmonaut.annotations.QueryMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2244p5;
import p204p.cln0;
import p204p.edb;
import p204p.hzq0;
import p204p.tka1;
import p204p.wj50;
import p204p.xul0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/QueryAtom;", "", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "", "call", "([Ljava/lang/Object;)Ljava/util/Map;", "", "ret", "Lp/w2a1;", "fillQueryArguments", "(Ljava/util/Map;[Ljava/lang/Object;)V", "fillQueryMapArguments", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Query;", "namedQueryIndex", "Ljava/util/List;", "Lp/xul0;", "Lcom/spotify/cosmos/cosmonaut/annotations/QueryMap;", "queryMapIndex", "Lp/xul0;", "Companion", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class QueryAtom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<IndexedAnnotation<Query>> namedQueryIndex;
    private final xul0 queryMapIndex;

    @Metadata(m24211d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/QueryAtom$Companion;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "method", "", "Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "Lcom/spotify/cosmos/cosmonaut/annotations/Query;", "createNamedQueryIndex", "(Ljava/lang/reflect/Method;)Ljava/util/List;", "Lp/xul0;", "Lcom/spotify/cosmos/cosmonaut/annotations/QueryMap;", "findQueryMapIndex", "(Ljava/lang/reflect/Method;)Lp/xul0;", "Ljava/lang/reflect/Type;", "type", "", "isValidQueryMapArgumentType", "(Ljava/lang/reflect/Type;)Z", "", "name", "arg", "convertQueryArg", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "", "convertToTypedMap", "(Ljava/lang/Object;)Ljava/util/Map;", "Ljava/lang/Class;", "clazz", "isClassAssignableFromType", "(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<IndexedAnnotation<Query>> createNamedQueryIndex(Method method) {
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
                Query query = (Query) companion.findAnnotation(annotationArr, Query.class);
                IndexedAnnotation indexedAnnotation = query == null ? null : new IndexedAnnotation(query, i2);
                if (indexedAnnotation != null) {
                    arrayList.add(indexedAnnotation);
                }
                i++;
                i2 = i3;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final xul0 findQueryMapIndex(Method method) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            wj50.m88279p(parameterAnnotations);
            int length = parameterAnnotations.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                Annotation[] annotationArr = parameterAnnotations[i];
                ReflectionUtil.Companion companion = ReflectionUtil.INSTANCE;
                wj50.m88279p(annotationArr);
                QueryMap queryMap = (QueryMap) companion.findAnnotation(annotationArr, QueryMap.class);
                if (queryMap != null) {
                    Type type = method.getGenericParameterTypes()[i2];
                    Companion companion2 = QueryAtom.INSTANCE;
                    wj50.m88279p(type);
                    if (companion2.isValidQueryMapArgumentType(type)) {
                        return new hzq0(new IndexedAnnotation(queryMap, i2));
                    }
                    throw new IllegalArgumentException("@QueryMap argument should be Map<String, Object> or Map<String, String>");
                }
                i++;
                i2 = i3;
            }
            return C2244p5.f174033a;
        }

        public final String convertQueryArg(String name, Object arg) {
            if (arg instanceof String) {
                return (String) arg;
            }
            if (arg instanceof Number) {
                return arg.toString();
            }
            if (arg instanceof Boolean) {
                return String.valueOf(((Boolean) arg).booleanValue());
            }
            throw new IllegalArgumentException(edb.m38566o("@Query argument ", name, " has unsupported type: ", arg.getClass().getName()));
        }

        public final Map<String, Object> convertToTypedMap(Object arg) {
            return (Map) arg;
        }

        public final boolean isClassAssignableFromType(Type type, Class<?> clazz) {
            return (type instanceof Class) && clazz.isAssignableFrom((Class) type);
        }

        public final boolean isValidQueryMapArgumentType(Type type) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == 2) {
                    wj50.m88279p(rawType);
                    if (isClassAssignableFromType(rawType, Map.class) && isClassAssignableFromType(actualTypeArguments[0], String.class)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public QueryAtom(Method method) {
        Companion companion = INSTANCE;
        this.namedQueryIndex = companion.createNamedQueryIndex(method);
        this.queryMapIndex = companion.findQueryMapIndex(method);
    }

    public final Map<String, String> call(Object[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fillQueryArguments(linkedHashMap, args);
        fillQueryMapArguments(linkedHashMap, args);
        return linkedHashMap;
    }

    public final void fillQueryArguments(Map<String, String> ret, Object[] args) {
        cln0 cln0Var = tka1.f221112a;
        for (IndexedAnnotation<Query> indexedAnnotation : this.namedQueryIndex) {
            if (args == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj = args[indexedAnnotation.getIndex()];
            if (obj != null) {
                String strValue = ((Query) indexedAnnotation.getAnnot()).value();
                Companion companion = INSTANCE;
                String strConvertQueryArg = companion.convertQueryArg(strValue, obj);
                if (!((Query) indexedAnnotation.getAnnot()).encoded()) {
                    strConvertQueryArg = cln0Var.m33285M(strConvertQueryArg);
                }
                ret.put(strValue, companion.convertQueryArg(strValue, strConvertQueryArg));
            }
        }
    }

    public final void fillQueryMapArguments(Map<String, String> ret, Object[] args) {
        cln0 cln0Var = tka1.f221112a;
        if (this.queryMapIndex.mo49279c()) {
            IndexedAnnotation indexedAnnotation = (IndexedAnnotation) this.queryMapIndex.mo49278b();
            if (args == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj = args[indexedAnnotation.getIndex()];
            if (obj instanceof Map) {
                for (Map.Entry<String, Object> entry : INSTANCE.convertToTypedMap(obj).entrySet()) {
                    String strConvertQueryArg = INSTANCE.convertQueryArg(entry.getKey(), entry.getValue());
                    if (!((QueryMap) indexedAnnotation.getAnnot()).encoded()) {
                        strConvertQueryArg = cln0Var.m33285M(strConvertQueryArg);
                    }
                    ret.put(entry.getKey(), strConvertQueryArg);
                }
            }
        }
    }
}
