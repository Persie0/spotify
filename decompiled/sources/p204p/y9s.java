package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y9s {

    /* JADX INFO: renamed from: a */
    public static final y9s f270638a;

    /* JADX INFO: renamed from: b */
    public static final y9s f270639b;

    /* JADX INFO: renamed from: c */
    public static final y9s f270640c;

    /* JADX INFO: renamed from: d */
    public static final y9s f270641d;

    /* JADX INFO: renamed from: e */
    public static final y9s f270642e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ y9s[] f270643f;

    static {
        y9s y9sVar = new y9s("NONE", 0);
        f270638a = y9sVar;
        y9s y9sVar2 = new y9s(SearchEndpointResponseKt.RESULT_ERROR, 1);
        f270639b = y9sVar2;
        y9s y9sVar3 = new y9s("WAITING", 2);
        f270640c = y9sVar3;
        y9s y9sVar4 = new y9s("DOWNLOADING", 3);
        f270641d = y9sVar4;
        y9s y9sVar5 = new y9s("DOWNLOADED", 4);
        f270642e = y9sVar5;
        f270643f = new y9s[]{y9sVar, y9sVar2, y9sVar3, y9sVar4, y9sVar5};
    }

    public static y9s valueOf(String str) {
        return (y9s) Enum.valueOf(y9s.class, str);
    }

    public static y9s[] values() {
        return (y9s[]) f270643f.clone();
    }
}
