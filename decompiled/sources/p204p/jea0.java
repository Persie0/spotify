package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jea0 {

    /* JADX INFO: renamed from: a */
    public static final PlayOrigin f111517a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("external-integration-service");
        th50 th50Var = uh50.f230369a;
        f111517a = builder.referrerIdentifier("external-integration-service").build();
    }
}
