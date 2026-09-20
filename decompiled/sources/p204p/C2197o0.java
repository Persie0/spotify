package p204p;

import com.spotify.messages.ListeningPartyChannelError;
import com.squareup.moshi.JsonDataException;
import io.ably.lib.types.MessageDecodeException;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: p.o0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C2197o0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2435u0 f160193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f160194c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f160195d;

    public /* synthetic */ C2197o0(C2435u0 c2435u0, String str, String str2, int i) {
        this.f160192a = i;
        this.f160193b = c2435u0;
        this.f160194c = str;
        this.f160195d = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f160192a) {
            case 0:
                Throwable th = (Throwable) obj;
                C2435u0 c2435u0 = this.f160193b;
                String str = this.f160194c;
                String str2 = this.f160195d;
                if (th instanceof JsonDataException) {
                    na6.m63972t("LP ably message error | roomUri> " + str + " | channel> " + str2, th);
                    return;
                }
                if (th instanceof MessageDecodeException) {
                    na6.m63972t("LP ably message error | roomUri> " + str + " | channel> " + str2, th);
                    return;
                }
                if (th instanceof C1962i0) {
                    return;
                }
                qre0 qre0Var = c2435u0.f225335a;
                rh90 rh90VarM13925q = ListeningPartyChannelError.m13925q();
                rh90VarM13925q.m75508r(str);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                rh90VarM13925q.m75507q(message);
                rh90VarM13925q.m75506m(str2);
                qre0Var.m73616a(rh90VarM13925q.build());
                return;
            default:
                ekd0 ekd0Var = (ekd0) obj;
                C2435u0 c2435u1 = this.f160193b;
                LinkedHashMap linkedHashMap = c2435u1.f225338d;
                String str3 = this.f160194c;
                String str4 = this.f160195d;
                synchronized (linkedHashMap) {
                    try {
                        String str5 = (String) c2435u1.f225338d.get(str3);
                        if (str5 != null && !str5.equals(ekd0Var.getF5213b())) {
                            qre0 qre0Var2 = c2435u1.f225335a;
                            rh90 rh90VarM13925q2 = ListeningPartyChannelError.m13925q();
                            rh90VarM13925q2.m75508r(str4);
                            rh90VarM13925q2.m75507q("missed event: " + ekd0Var.getF5213b());
                            rh90VarM13925q2.m75506m(str3);
                            qre0Var2.m73616a(rh90VarM13925q2.build());
                        }
                        c2435u1.f225338d.put(str3, ekd0Var.getF5212a().f5184b);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
