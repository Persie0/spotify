package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class g130 extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75520a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g130(float f, int i, boolean z) {
        super(i, f, z);
        this.f75520a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Matcher m43320b(String str, Pattern pattern, g130 g130Var) {
        Matcher matcher = (Matcher) g130Var.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        g130Var.put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(Object obj) {
        switch (this.f75520a) {
            case 1:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            case 2:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(Object obj) {
        switch (this.f75520a) {
            case 1:
                if (obj instanceof Single) {
                    return super.containsValue((Single) obj);
                }
                return false;
            case 2:
                if (obj instanceof cy21) {
                    return super.containsValue((cy21) obj);
                }
                return false;
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object get(Object obj) {
        switch (this.f75520a) {
            case 1:
                if (obj instanceof String) {
                    return (Single) super.get((String) obj);
                }
                return null;
            case 2:
                if (obj instanceof String) {
                    return (cy21) super.get((String) obj);
                }
                return null;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.f75520a) {
            case 1:
                return !(obj instanceof String) ? obj2 : (Single) super.getOrDefault((String) obj, (Single) obj2);
            case 2:
                return !(obj instanceof String) ? obj2 : (cy21) super.getOrDefault((String) obj, (cy21) obj2);
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object remove(Object obj) {
        switch (this.f75520a) {
            case 1:
                if (obj instanceof String) {
                    return (Single) super.remove((String) obj);
                }
                return null;
            case 2:
                if (obj instanceof String) {
                    return (cy21) super.remove((String) obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f75520a) {
            case 0:
                return size() > 32;
            case 1:
                return super.size() > 3;
            default:
                return super.size() > 4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g130(int i) {
        super(5, 1.0f, true);
        this.f75520a = i;
        switch (i) {
            case 2:
                break;
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.f75520a) {
            case 1:
                if ((obj instanceof String) && (obj2 instanceof Single)) {
                    return super.remove((String) obj, (Single) obj2);
                }
                return false;
            case 2:
                if ((obj instanceof String) && (obj2 instanceof cy21)) {
                    return super.remove((String) obj, (cy21) obj2);
                }
                return false;
            default:
                return super.remove(obj, obj2);
        }
    }
}
