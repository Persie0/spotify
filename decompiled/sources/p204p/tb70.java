package p204p;

import com.squareup.moshi.JsonDataException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u001b\u001fBW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m24212d2 = {"Lp/tb70;", "T", "Lp/hk60;", "Lp/oq60;", "constructor", "", "Lp/tb70$a;", "", "allBindings", "nonIgnoredBindings", "Lp/xl60$b;", "options", "<init>", "(Lp/oq60;Ljava/util/List;Ljava/util/List;Lp/xl60$b;)V", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Ljava/lang/Object;", "Lp/rm60;", "writer", "value", "Lp/w2a1;", "toJson", "(Lp/rm60;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Lp/oq60;", "getConstructor", "()Lp/oq60;", "b", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "c", "getNonIgnoredBindings", "d", "Lp/xl60$b;", "getOptions", "()Lp/xl60$b;", "moshi-kotlin"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class tb70<T> extends hk60<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final oq60 constructor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C2408a<T, Object>> allBindings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C2408a<T, Object>> nonIgnoredBindings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final xl60.C2578b options;

    /* JADX INFO: renamed from: p.tb70$a */
    @Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jb\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010\u001c¨\u0006/"}, m24212d2 = {"Lp/tb70$a;", "K", "P", "", "", "jsonName", "Lp/hk60;", "adapter", "Lp/nr60;", "property", "Lp/hr60;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Lp/hk60;Lp/nr60;Lp/hr60;I)V", "value", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "Lp/w2a1;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)V", "a", "(Ljava/lang/String;Lp/hk60;Lp/nr60;Lp/hr60;I)Lp/tb70$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lp/hk60;", "d", "()Lp/hk60;", "Lp/nr60;", "f", "()Lp/nr60;", "Lp/hr60;", "getParameter", "()Lp/hr60;", "I", "g", "moshi-kotlin"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
    public static final /* data */ class C2408a<K, P> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String jsonName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final hk60<P> adapter;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final nr60 property;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final hr60 parameter;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int propertyIndex;

        public C2408a(String str, hk60<P> hk60Var, nr60 nr60Var, hr60 hr60Var, int i) {
            this.jsonName = str;
            this.adapter = hk60Var;
            this.property = nr60Var;
            this.parameter = hr60Var;
            this.propertyIndex = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C2408a m80379b(C2408a c2408a, String str, hk60 hk60Var, nr60 nr60Var, hr60 hr60Var, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = c2408a.jsonName;
            }
            if ((i2 & 2) != 0) {
                hk60Var = c2408a.adapter;
            }
            if ((i2 & 4) != 0) {
                nr60Var = c2408a.property;
            }
            if ((i2 & 8) != 0) {
                hr60Var = c2408a.parameter;
            }
            if ((i2 & 16) != 0) {
                i = c2408a.propertyIndex;
            }
            int i3 = i;
            nr60 nr60Var2 = nr60Var;
            return c2408a.m80380a(str, hk60Var, nr60Var2, hr60Var, i3);
        }

        /* JADX INFO: renamed from: a */
        public final C2408a<K, P> m80380a(String jsonName, hk60<P> adapter, nr60 property, hr60 parameter, int propertyIndex) {
            return new C2408a<>(jsonName, adapter, property, parameter, propertyIndex);
        }

        /* JADX INFO: renamed from: c */
        public final P m80381c(K value) {
            return (P) this.property.get(value);
        }

        /* JADX INFO: renamed from: d */
        public final hk60<P> m80382d() {
            return this.adapter;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getJsonName() {
            return this.jsonName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C2408a)) {
                return false;
            }
            C2408a c2408a = (C2408a) other;
            return wj50.m88271j(this.jsonName, c2408a.jsonName) && wj50.m88271j(this.adapter, c2408a.adapter) && wj50.m88271j(this.property, c2408a.property) && wj50.m88271j(this.parameter, c2408a.parameter) && this.propertyIndex == c2408a.propertyIndex;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final nr60 getProperty() {
            return this.property;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        /* JADX INFO: renamed from: h */
        public final void m80386h(K result, P value) {
            if (value != vb70.f239430b) {
                ((yq60) this.property).mo25834b0(result, value);
            }
        }

        public int hashCode() {
            int iHashCode = (this.property.hashCode() + ((this.adapter.hashCode() + (this.jsonName.hashCode() * 31)) * 31)) * 31;
            hr60 hr60Var = this.parameter;
            return Integer.hashCode(this.propertyIndex) + ((iHashCode + (hr60Var == null ? 0 : hr60Var.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Binding(jsonName=");
            sb.append(this.jsonName);
            sb.append(", adapter=");
            sb.append(this.adapter);
            sb.append(", property=");
            sb.append(this.property);
            sb.append(", parameter=");
            sb.append(this.parameter);
            sb.append(", propertyIndex=");
            return edb.m38567p(sb, this.propertyIndex, ')');
        }
    }

    /* JADX INFO: renamed from: p.tb70$b */
    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, m24212d2 = {"Lp/tb70$b;", "Lp/t8;", "Lp/hr60;", "", "", "parameterKeys", "", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", "key", "value", "h", "(Lp/hr60;Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Lp/hr60;)Z", "f", "(Lp/hr60;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "[Ljava/lang/Object;", "", "", "()Ljava/util/Set;", "entries", "moshi-kotlin"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
    public static final class C2409b extends AbstractC2404t8 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<hr60> parameterKeys;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object[] parameterValues;

        /* JADX WARN: Multi-variable type inference failed */
        public C2409b(List<? extends hr60> list, Object[] objArr) {
            this.parameterKeys = list;
            this.parameterValues = objArr;
        }

        @Override // p204p.AbstractC2404t8
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<hr60, Object>> mo48297a() {
            List<hr60> list = this.parameterKeys;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                arrayList.add(new AbstractMap.SimpleEntry((hr60) t, this.parameterValues[i]));
                i = i2;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t2 : arrayList) {
                if (((AbstractMap.SimpleEntry) t2).getValue() != vb70.f239430b) {
                    linkedHashSet.add(t2);
                }
            }
            return linkedHashSet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof hr60) {
                return m80387e((hr60) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public boolean m80387e(hr60 key) {
            return this.parameterValues[key.getIndex()] != vb70.f239430b;
        }

        /* JADX INFO: renamed from: f */
        public Object m80388f(hr60 key) {
            Object obj = this.parameterValues[key.getIndex()];
            if (obj != vb70.f239430b) {
                return obj;
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public /* bridge */ Object m80389g(hr60 hr60Var, Object obj) {
            return super.getOrDefault(hr60Var, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof hr60) {
                return m80388f((hr60) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof hr60) ? obj2 : m80389g((hr60) obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object put(hr60 key, Object value) {
            return null;
        }

        /* JADX INFO: renamed from: i */
        public /* bridge */ Object m80391i(hr60 hr60Var) {
            return super.remove(hr60Var);
        }

        /* JADX INFO: renamed from: j */
        public /* bridge */ boolean m80392j(hr60 hr60Var, Object obj) {
            return super.remove(hr60Var, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof hr60) {
                return m80391i((hr60) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof hr60) {
                return m80392j((hr60) obj, obj2);
            }
            return false;
        }
    }

    public tb70(oq60 oq60Var, List<C2408a<T, Object>> list, List<C2408a<T, Object>> list2, xl60.C2578b c2578b) {
        this.constructor = oq60Var;
        this.allBindings = list;
        this.nonIgnoredBindings = list2;
        this.options = c2578b;
    }

    @Override // p204p.hk60
    public T fromJson(xl60 reader) {
        int size = this.constructor.mo25528e().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            objArr[i] = vb70.f239430b;
        }
        reader.mo51076c();
        while (reader.mo51079i()) {
            int iMo51071K = reader.mo51071K(this.options);
            if (iMo51071K == -1) {
                reader.mo51073P();
                reader.mo51074Q();
            } else {
                C2408a<T, Object> c2408a = this.nonIgnoredBindings.get(iMo51071K);
                int propertyIndex = c2408a.getPropertyIndex();
                if (objArr[propertyIndex] != vb70.f239430b) {
                    throw new JsonDataException("Multiple values for '" + c2408a.getProperty().getName() + "' at " + reader.m91387h());
                }
                Object objFromJson = c2408a.m80382d().fromJson(reader);
                objArr[propertyIndex] = objFromJson;
                if (objFromJson == null && !c2408a.getProperty().mo25530i().mo27066q()) {
                    throw f0b1.m40470x(c2408a.getProperty().getName(), c2408a.getJsonName(), reader);
                }
            }
        }
        reader.mo51078f();
        boolean z = this.allBindings.size() == size;
        for (int i2 = 0; i2 < size; i2++) {
            if (objArr[i2] == vb70.f239430b) {
                if (((hr60) this.constructor.mo25528e().get(i2)).mo42979L()) {
                    z = false;
                } else {
                    if (!((hr60) this.constructor.mo25528e().get(i2)).getType().mo27066q()) {
                        String name = ((hr60) this.constructor.mo25528e().get(i2)).getName();
                        C2408a<T, Object> c2408a2 = this.allBindings.get(i2);
                        throw f0b1.m40461o(name, c2408a2 != null ? c2408a2.getJsonName() : null, reader);
                    }
                    objArr[i2] = null;
                }
            }
        }
        T t = z ? (T) this.constructor.mo36585j(Arrays.copyOf(objArr, size2)) : (T) this.constructor.mo36586r(new C2409b(this.constructor.mo25528e(), objArr));
        int size3 = this.allBindings.size();
        while (size < size3) {
            C2408a<T, Object> c2408a3 = this.allBindings.get(size);
            wj50.m88279p(c2408a3);
            c2408a3.m80386h(t, objArr[size]);
            size++;
        }
        return t;
    }

    @Override // p204p.hk60
    public void toJson(rm60 writer, T value) {
        if (value == null) {
            throw new NullPointerException("value == null");
        }
        writer.mo56891e();
        for (C2408a<T, Object> c2408a : this.allBindings) {
            if (c2408a != null) {
                writer.mo56894s(c2408a.getJsonName());
                c2408a.m80382d().toJson(writer, c2408a.m80381c(value));
            }
        }
        writer.mo56893i();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.mo25530i() + ')';
    }
}
