package p204p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class fs91 extends ozi0 {

    /* JADX INFO: renamed from: s */
    public static final fs91 f72815s = new fs91(false, 0);

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f72816r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs91(boolean z, int i) {
        super(z);
        this.f72816r = i;
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: a */
    public final Object mo38907a(String str, Bundle bundle) {
        switch (this.f72816r) {
            case 0:
                return null;
            case 1:
                Object obj = bundle.get(str);
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                return null;
            case 2:
                Object obj2 = bundle.get(str);
                if (obj2 instanceof Double) {
                    return (Double) obj2;
                }
                return null;
            case 3:
                return (Double) bundle.get(str);
            case 4:
                Object obj3 = bundle.get(str);
                if (obj3 instanceof Float) {
                    return (Float) obj3;
                }
                return null;
            case 5:
                Object obj4 = bundle.get(str);
                if (obj4 instanceof Integer) {
                    return (Integer) obj4;
                }
                return null;
            case 6:
                Object obj5 = bundle.get(str);
                if (obj5 instanceof Long) {
                    return (Long) obj5;
                }
                return null;
            default:
                String string = bundle.getString(str);
                return string == null ? "null" : string;
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: b */
    public final String mo38908b() {
        switch (this.f72816r) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: d */
    public final Object mo38910d(String str) {
        switch (this.f72816r) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) ozi0.f172299l.mo38910d(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return (Float) ozi0.f172296i.mo38910d(str);
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) ozi0.f172289b.mo38910d(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) ozi0.f172293f.mo38910d(str);
            default:
                return str;
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: e */
    public final void mo38911e(Bundle bundle, String str, Object obj) {
        switch (this.f72816r) {
            case 0:
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    ozi0.f172299l.mo38911e(bundle, str, bool);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 2:
                Double d = (Double) obj;
                if (d != null) {
                    bundle.putDouble(str, d.doubleValue());
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 3:
                bundle.putDouble(str, ((Number) obj).doubleValue());
                break;
            case 4:
                Float f = (Float) obj;
                if (f != null) {
                    ozi0.f172296i.mo38911e(bundle, str, f);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                if (num != null) {
                    ozi0.f172289b.mo38911e(bundle, str, num);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 6:
                Long l = (Long) obj;
                if (l != null) {
                    ozi0.f172293f.mo38911e(bundle, str, l);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            default:
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: f */
    public String mo42555f(Object obj) {
        switch (this.f72816r) {
            case 7:
                return Uri.encode((String) obj);
            default:
                return super.mo42555f(obj);
        }
    }
}
