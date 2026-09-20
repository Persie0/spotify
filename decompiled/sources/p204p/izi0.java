package p204p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class izi0 extends ozi0 {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f107236r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izi0(boolean z, int i) {
        super(z);
        this.f107236r = i;
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: a */
    public final Object mo38907a(String str, Bundle bundle) {
        switch (this.f107236r) {
            case 0:
                return (Boolean) bundle.get(str);
            case 1:
                return (Float) bundle.get(str);
            case 2:
                return (Integer) bundle.get(str);
            case 3:
                return (Long) bundle.get(str);
            case 4:
                return (Integer) bundle.get(str);
            default:
                return (String) bundle.get(str);
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: b */
    public final String mo38908b() {
        switch (this.f107236r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: d */
    public final Object mo38910d(String str) {
        boolean z;
        int i;
        long j;
        int i2;
        switch (this.f107236r) {
            case 0:
                if (str.equals("true")) {
                    z = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (bm51.m29803n0(str, "0x", false)) {
                    String strSubstring = str.substring(2);
                    zn91.m96584x(16);
                    i = Integer.parseInt(strSubstring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                String strM36609i = bm51.m29796g0(str, "L", false) ? dq60.m36609i(1, 0, str) : str;
                if (bm51.m29803n0(str, "0x", false)) {
                    String strSubstring2 = strM36609i.substring(2);
                    zn91.m96584x(16);
                    j = Long.parseLong(strSubstring2, 16);
                } else {
                    j = Long.parseLong(strM36609i);
                }
                return Long.valueOf(j);
            case 4:
                if (bm51.m29803n0(str, "0x", false)) {
                    String strSubstring3 = str.substring(2);
                    zn91.m96584x(16);
                    i2 = Integer.parseInt(strSubstring3, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: e */
    public final void mo38911e(Bundle bundle, String str, Object obj) {
        switch (this.f107236r) {
            case 0:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 1:
                bundle.putFloat(str, ((Number) obj).floatValue());
                break;
            case 2:
                bundle.putInt(str, ((Number) obj).intValue());
                break;
            case 3:
                bundle.putLong(str, ((Number) obj).longValue());
                break;
            case 4:
                bundle.putInt(str, ((Number) obj).intValue());
                break;
            default:
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: f */
    public String mo42555f(Object obj) {
        switch (this.f107236r) {
            case 5:
                String str = (String) obj;
                String strEncode = str != null ? Uri.encode(str) : null;
                return strEncode == null ? "null" : strEncode;
            default:
                return super.mo42555f(obj);
        }
    }
}
