package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sw3 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f214575b;

    /* JADX WARN: Multi-variable type inference failed */
    public sw3(int i, eh00 eh00Var) {
        this.f214574a = i;
        switch (i) {
            case 6:
                this.f214575b = (qe70) eh00Var;
                break;
            default:
                this.f214575b = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r0v5, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v7, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r4v13, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r4v8, types: [p.eh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f214574a) {
            case 0:
                StringBuilder sb = new StringBuilder("Search got results, onSuccess was: ");
                ?? r1 = this.f214575b;
                sb.append((Object) r1);
                Logger.m3965a(sb.toString(), new Object[0]);
                r1.invoke((List) obj);
                break;
            case 1:
                ?? r0 = this.f214575b;
                Logger.m3965a("MBS: Search got results, onSuccess was: %s", r0);
                r0.invoke((List) obj);
                break;
            case 2:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Unknown search error.";
                }
                this.f214575b.invoke(i9d0.f99991c, message);
                break;
            case 3:
                this.f214575b.invoke();
                break;
            case 4:
                this.f214575b.invoke(obj);
                break;
            case 5:
                this.f214575b.invoke(Integer.valueOf((int) ((Long) obj).longValue()));
                break;
            default:
                this.f214575b.invoke();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sw3(int i, gh00 gh00Var) {
        this.f214574a = i;
        switch (i) {
            case 1:
                this.f214575b = (qe70) gh00Var;
                break;
            case 2:
            case 3:
            default:
                this.f214575b = (qe70) gh00Var;
                break;
            case 4:
                this.f214575b = (qe70) gh00Var;
                break;
            case 5:
                this.f214575b = (qe70) gh00Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sw3(th00 th00Var) {
        this.f214574a = 2;
        this.f214575b = (qe70) th00Var;
    }
}
