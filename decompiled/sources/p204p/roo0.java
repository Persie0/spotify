package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes9.dex */
public abstract class roo0 {
    /* JADX INFO: renamed from: a */
    public static PlayOrigin m76076a(agy agyVar, String str, voc1 voc1Var, th50 th50Var) {
        return PlayOrigin.builder(agyVar.getName()).featureVersion(str).viewUri(voc1Var.f243453a).referrerIdentifier(th50Var.f220333a.getName()).build();
    }
}
