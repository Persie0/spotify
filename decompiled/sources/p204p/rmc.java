package p204p;

import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.PresenceMessage;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class rmc implements uuf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f200493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f200494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f200495c;

    public /* synthetic */ rmc(int i, Object obj, Object obj2) {
        this.f200493a = i;
        this.f200495c = obj;
        this.f200494b = obj2;
    }

    @Override // p204p.uuf
    public final void onError(ErrorInfo errorInfo) {
        switch (this.f200493a) {
            case 0:
                ((bnc) this.f200495c).m29945j();
                bnc.m29940h((uuf) this.f200494b, errorInfo);
                break;
            case 1:
                ((bnc) this.f200495c).m29945j();
                bnc.m29940h((uuf) this.f200494b, errorInfo);
                break;
            default:
                Locale locale = Locale.ROOT;
                String str = ((PresenceMessage) this.f200494b).clientId;
                xyq0 xyq0Var = (xyq0) this.f200495c;
                String str2 = "Cannot automatically re-enter " + str + " on channel " + xyq0Var.f267404f.f28784c + " (" + errorInfo.message + ")";
                tx8.m81889d(xyq0.f267398h, str2);
                xyq0Var.f267404f.m29948m(new ErrorInfo(str2, 91004));
                break;
        }
    }

    @Override // p204p.uuf
    public final void onSuccess() {
        switch (this.f200493a) {
            case 0:
                ((bnc) this.f200495c).m29945j();
                bnc.m29941i((uuf) this.f200494b);
                break;
            case 1:
                ((bnc) this.f200495c).m29945j();
                bnc.m29941i((uuf) this.f200494b);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m75942a() {
    }
}
