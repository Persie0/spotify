package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX INFO: loaded from: classes11.dex */
public final class y1m0 {

    /* JADX INFO: renamed from: c */
    public static final y1m0 f268335c = new y1m0(1, SearchEndpointResponseKt.RESULT_SUCCESS);

    /* JADX INFO: renamed from: a */
    public final int f268336a;

    /* JADX INFO: renamed from: b */
    public final String f268337b;

    public y1m0(int i, String str) {
        if (i == 0) {
            m92658a(3);
            throw null;
        }
        this.f268336a = i;
        this.f268337b = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92658a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
        if (i == 1 || i == 2) {
            objArr[0] = "debugMessage";
        } else if (i == 3) {
            objArr[0] = "success";
        } else if (i != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i == 1) {
            objArr[2] = "incompatible";
        } else if (i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    /* JADX INFO: renamed from: c */
    public static y1m0 m92659c(String str) {
        return new y1m0(2, str);
    }

    /* JADX INFO: renamed from: b */
    public final int m92660b() {
        int i = this.f268336a;
        if (i != 0) {
            return i;
        }
        m92658a(5);
        throw null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f268336a;
        if (i == 1) {
            str = "OVERRIDABLE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CONFLICT";
        } else {
            str = "INCOMPATIBLE";
        }
        sb.append(str);
        sb.append(": ");
        sb.append(this.f268337b);
        return sb.toString();
    }
}
