package p204p;

import com.spotify.libs.sociallistening.events.proto.JamSessionCreationResult;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class wq41 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xq41 f253928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uq41 f253929c;

    public /* synthetic */ wq41(xq41 xq41Var, uq41 uq41Var, int i) {
        this.f253927a = i;
        this.f253928b = xq41Var;
        this.f253929c = uq41Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f253927a) {
            case 0:
                an10 an10Var = this.f253928b.f264874c;
                String strMo59694a = this.f253929c.mo59694a();
                String str = ((by50) obj).f32075a;
                k760 k760VarM12842q = JamSessionCreationResult.m12842q();
                k760VarM12842q.m55630m(strMo59694a);
                k760VarM12842q.m55632r(str);
                an10Var.f17243a.m73616a(k760VarM12842q.build());
                return;
            default:
                Throwable th = (Throwable) obj;
                an10 an10Var2 = this.f253928b.f264874c;
                String strMo59694a2 = this.f253929c.mo59694a();
                String strM80649g = "TIMEOUT";
                if (th instanceof z9l) {
                    z9l z9lVar = (z9l) th;
                    if (z9lVar.equals(v9l.f238977a)) {
                        strM80649g = "OFFLINE";
                    } else if (!z9lVar.equals(w9l.f249195a)) {
                        if (z9lVar.equals(x9l.f259395a)) {
                            strM80649g = "UNKNOWN";
                        } else {
                            if (!(z9lVar instanceof y9l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y9l y9lVar = (y9l) th;
                            strM80649g = tfe.m80649g(y9lVar.f270615a, ":", y9lVar.f270616b);
                        }
                    }
                } else if (!(th instanceof TimeoutException)) {
                    strM80649g = "UNKNOWN";
                }
                k760 k760VarM12842q2 = JamSessionCreationResult.m12842q();
                k760VarM12842q2.m55630m(strMo59694a2);
                k760VarM12842q2.m55631q(strM80649g);
                an10Var2.f17243a.m73616a(k760VarM12842q2.build());
                return;
        }
    }
}
