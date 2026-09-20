package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class adn {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m25588A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SUNDAY")) {
            return 1;
        }
        if (str.equals("MONDAY")) {
            return 2;
        }
        if (str.equals("TUESDAY")) {
            return 3;
        }
        if (str.equals("WEDNESDAY")) {
            return 4;
        }
        if (str.equals("THURSDAY")) {
            return 5;
        }
        if (str.equals("FRIDAY")) {
            return 6;
        }
        if (str.equals("SATURDAY")) {
            return 7;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.promptedplaylists.artifactpage.api.Days.".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public static final String m25589a(int i) {
        return m25590b(i);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m25590b(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "only_me";
        }
        if (i == 3) {
            return "friends";
        }
        if (i == 4) {
            return "everyone";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static View m25591c(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BigDecimal m25592d(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }

    /* JADX INFO: renamed from: e */
    public static h4t0 m25593e(xg0 xg0Var, int i) {
        return be21.m28868a(new zao(xg0Var, i, 7));
    }

    /* JADX INFO: renamed from: f */
    public static h4t0 m25594f(d23 d23Var, int i) {
        return b2s.m27972b(new s7o(d23Var, i, 20));
    }

    /* JADX INFO: renamed from: g */
    public static h4t0 m25595g(nml nmlVar, int i) {
        return be21.m28868a(new zao(nmlVar, i, 6));
    }

    /* JADX INFO: renamed from: h */
    public static h4t0 m25596h(tsm tsmVar, int i) {
        return b2s.m27972b(new d3o(tsmVar, i, 20));
    }

    /* JADX INFO: renamed from: i */
    public static h4t0 m25597i(otm otmVar, int i) {
        return b2s.m27972b(new zao(otmVar, i, 24));
    }

    /* JADX INFO: renamed from: j */
    public static h4t0 m25598j(bdn bdnVar, int i) {
        return be21.m28868a(new zbn(bdnVar, i, 15));
    }

    /* JADX INFO: renamed from: k */
    public static h4t0 m25599k(ofn ofnVar, int i) {
        return be21.m28868a(new oyn(ofnVar, i, 12));
    }

    /* JADX INFO: renamed from: l */
    public static h4t0 m25600l(son sonVar, jnm jnmVar, int i) {
        return be21.m28868a(new tmn(sonVar, jnmVar, i, 13));
    }

    /* JADX INFO: renamed from: m */
    public static h4t0 m25601m(son sonVar, xkn xknVar, int i) {
        return b2s.m27972b(new phn(sonVar, xknVar, i, 22));
    }

    /* JADX INFO: renamed from: n */
    public static h4t0 m25602n(son sonVar, nmn nmnVar, int i) {
        return b2s.m27972b(new vfn(sonVar, nmnVar, i, 1));
    }

    /* JADX INFO: renamed from: o */
    public static h4t0 m25603o(son sonVar, otn otnVar, hhn hhnVar, int i) {
        return be21.m28868a(new wfn(sonVar, otnVar, hhnVar, i, 2));
    }

    /* JADX INFO: renamed from: p */
    public static h4t0 m25604p(o2o o2oVar, int i) {
        return be21.m28868a(new oyn(o2oVar, i, 24));
    }

    /* JADX INFO: renamed from: q */
    public static h4t0 m25605q(d6o d6oVar, int i) {
        return be21.m28868a(new d3o(d6oVar, i, 5));
    }

    /* JADX INFO: renamed from: r */
    public static h4t0 m25606r(oao oaoVar, int i) {
        return b2s.m27972b(new s7o(oaoVar, i, 26));
    }

    /* JADX INFO: renamed from: s */
    public static h4t0 m25607s(son sonVar, jnm jnmVar, int i) {
        return be21.m28868a(new tmn(sonVar, jnmVar, i, 14));
    }

    /* JADX INFO: renamed from: t */
    public static h4t0 m25608t(son sonVar, xkn xknVar, int i) {
        return be21.m28868a(new phn(sonVar, xknVar, i, 22));
    }

    /* JADX INFO: renamed from: u */
    public static h4t0 m25609u(son sonVar, nmn nmnVar, int i) {
        return be21.m28868a(new vfn(sonVar, nmnVar, i, 1));
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m25610v(int i) {
        if (i == 1) {
            return "Required";
        }
        if (i == 2) {
            return "Optional";
        }
        if (i == 3) {
            return "Result";
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m25611w(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ONLY_ME";
        }
        if (i == 3) {
            return "FRIENDS";
        }
        if (i == 4) {
            return "EVERYONE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m25612x(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "GENERIC";
        }
        return SearchEndpointResponseKt.RESULT_SUCCESS;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m25613y(int i) {
        if (i == 1) {
            return "MEMORY_CACHE";
        }
        if (i == 2) {
            return "MEMORY";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NETWORK";
        }
        return "DISK";
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m25614z(int i) {
        if (i == 1) {
            return "Required";
        }
        if (i != 2) {
            return i != 3 ? "null" : "Result";
        }
        return "Optional";
    }
}
