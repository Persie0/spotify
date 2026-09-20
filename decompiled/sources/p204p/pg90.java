package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class pg90 {

    /* JADX INFO: Fake field, exist only in values array */
    pg90 EF5;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ pg90[] f177265b = {new pg90("UNKNOWN", 0), new pg90(SearchEndpointResponseKt.RESULT_SUCCESS, 1), new pg90("MISSING_INFORMATION", 2)};
    public static final og90 Companion = new og90();

    /* JADX INFO: renamed from: a */
    public static final Object f177264a = q3d0.m72078I(2, is80.f105166T0);

    public static pg90 valueOf(String str) {
        return (pg90) Enum.valueOf(pg90.class, str);
    }

    public static pg90[] values() {
        return (pg90[]) f177265b.clone();
    }
}
