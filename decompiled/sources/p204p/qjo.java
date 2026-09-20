package p204p;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qjo {

    /* JADX INFO: renamed from: a */
    public static final qjo f189273a;

    /* JADX INFO: renamed from: b */
    public static final qjo f189274b;

    /* JADX INFO: renamed from: c */
    public static final qjo f189275c;

    /* JADX INFO: renamed from: d */
    public static final qjo f189276d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ qjo[] f189277e;

    static {
        qjo qjoVar = new qjo("STOPPED", 0);
        f189273a = qjoVar;
        qjo qjoVar2 = new qjo("LOADING", 1);
        f189274b = qjoVar2;
        qjo qjoVar3 = new qjo("LOADED", 2);
        f189275c = qjoVar3;
        qjo qjoVar4 = new qjo(SearchEndpointResponseKt.RESULT_ERROR, 3);
        f189276d = qjoVar4;
        f189277e = new qjo[]{qjoVar, qjoVar2, qjoVar3, qjoVar4};
    }

    public static qjo valueOf(String str) {
        return (qjo) Enum.valueOf(qjo.class, str);
    }

    public static qjo[] values() {
        return (qjo[]) f189277e.clone();
    }
}
