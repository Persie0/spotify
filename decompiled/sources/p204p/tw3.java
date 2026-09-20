package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class tw3 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224302a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f224303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f224304c;

    /* JADX WARN: Multi-variable type inference failed */
    public tw3(eh00 eh00Var, eh00 eh00Var2) {
        this.f224303b = (qe70) eh00Var;
        this.f224304c = (qe70) eh00Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r3v9, types: [p.eh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f224302a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Search got error, onSuccess was: " + this.f224303b, new Object[0]);
                String message = th.getMessage();
                if (message == null) {
                    message = "Search error occurred.";
                }
                this.f224304c.invoke(i9d0.f99991c, message);
                return;
            default:
                tny0 tny0Var = (tny0) obj;
                if ((tny0Var instanceof sny0) || (tny0Var instanceof rny0)) {
                    this.f224303b.invoke();
                    return;
                } else {
                    if (!(tny0Var instanceof qny0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f224304c.invoke();
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tw3(gh00 gh00Var, th00 th00Var) {
        this.f224303b = (qe70) gh00Var;
        this.f224304c = (qe70) th00Var;
    }
}
