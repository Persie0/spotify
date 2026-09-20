package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class ewf1 {

    /* JADX INFO: renamed from: b */
    public static final ewf1 f63541b;

    /* JADX INFO: renamed from: c */
    public static final ewf1 f63542c;

    /* JADX INFO: renamed from: a */
    public final Throwable f63543a;

    static {
        if (prg1.f180600d) {
            f63542c = null;
            f63541b = null;
        } else {
            f63542c = new ewf1(null);
            f63541b = new ewf1(null);
        }
    }

    public ewf1(CancellationException cancellationException) {
        this.f63543a = cancellationException;
    }
}
