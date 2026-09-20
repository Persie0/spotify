package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zcy {

    /* JADX INFO: renamed from: a */
    public static final zcy f281585a;

    /* JADX INFO: renamed from: b */
    public static final zcy f281586b;

    /* JADX INFO: renamed from: c */
    public static final zcy f281587c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zcy[] f281588d;

    static {
        zcy zcyVar = new zcy(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f281585a = zcyVar;
        zcy zcyVar2 = new zcy("INVALID_CODE", 1);
        f281586b = zcyVar2;
        zcy zcyVar3 = new zcy("ALREADY_REDEEMED", 2);
        f281587c = zcyVar3;
        f281588d = new zcy[]{zcyVar, zcyVar2, zcyVar3};
    }

    public static zcy valueOf(String str) {
        return (zcy) Enum.valueOf(zcy.class, str);
    }

    public static zcy[] values() {
        return (zcy[]) f281588d.clone();
    }
}
