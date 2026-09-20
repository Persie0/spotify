package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nnz {

    /* JADX INFO: renamed from: a */
    public static final nnz f156532a;

    /* JADX INFO: renamed from: b */
    public static final nnz f156533b;

    /* JADX INFO: renamed from: c */
    public static final nnz f156534c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nnz[] f156535d;

    static {
        nnz nnzVar = new nnz(SearchEndpointResponseKt.RESULT_SUCCESS, 0);
        f156532a = nnzVar;
        nnz nnzVar2 = new nnz("SERVER_ERROR", 1);
        f156533b = nnzVar2;
        nnz nnzVar3 = new nnz("NO_CONNECTIVITY", 2);
        f156534c = nnzVar3;
        f156535d = new nnz[]{nnzVar, nnzVar2, nnzVar3, new nnz("UNKNOWN_ERROR", 3)};
    }

    public static nnz valueOf(String str) {
        return (nnz) Enum.valueOf(nnz.class, str);
    }

    public static nnz[] values() {
        return (nnz[]) f156535d.clone();
    }
}
