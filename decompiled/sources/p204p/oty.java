package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oty {

    /* JADX INFO: renamed from: a */
    public static final oty f170113a;

    /* JADX INFO: renamed from: b */
    public static final oty f170114b;

    /* JADX INFO: renamed from: c */
    public static final oty f170115c;

    /* JADX INFO: renamed from: d */
    public static final oty f170116d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ oty[] f170117e;

    static {
        oty otyVar = new oty("NOT_LOADED", 0);
        f170113a = otyVar;
        oty otyVar2 = new oty("LOADING", 1);
        f170114b = otyVar2;
        oty otyVar3 = new oty(SearchEndpointResponseKt.RESULT_SUCCESS, 2);
        f170115c = otyVar3;
        oty otyVar4 = new oty(SearchEndpointResponseKt.RESULT_ERROR, 3);
        f170116d = otyVar4;
        f170117e = new oty[]{otyVar, otyVar2, otyVar3, otyVar4};
    }

    public static oty valueOf(String str) {
        return (oty) Enum.valueOf(oty.class, str);
    }

    public static oty[] values() {
        return (oty[]) f170117e.clone();
    }
}
