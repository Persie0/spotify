package p204p;

import android.os.Bundle;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class afn0 {

    /* JADX INFO: renamed from: a */
    public static final afn0 f15176a;

    /* JADX INFO: renamed from: b */
    public static final afn0 f15177b;

    /* JADX INFO: renamed from: c */
    public static final afn0 f15178c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ afn0[] f15179d;

    static {
        afn0 afn0Var = new afn0(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f15176a = afn0Var;
        afn0 afn0Var2 = new afn0("ABORT", 1);
        f15177b = afn0Var2;
        afn0 afn0Var3 = new afn0("REQUEST_FULL_PRICE_OFFER", 2);
        f15178c = afn0Var3;
        f15179d = new afn0[]{afn0Var, afn0Var2, afn0Var3};
    }

    public static afn0 valueOf(String str) {
        return (afn0) Enum.valueOf(afn0.class, str);
    }

    public static afn0[] values() {
        return (afn0[]) f15179d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m25821a() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("PAYMENT_RESULT_BUNDLE_KEY", this);
        return bundle;
    }
}
