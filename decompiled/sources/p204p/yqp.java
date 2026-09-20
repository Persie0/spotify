package p204p;

import io.reactivex.rxjava3.subjects.CompletableSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class yqp {

    /* JADX INFO: renamed from: a */
    public final e1f0 f275270a;

    /* JADX INFO: renamed from: b */
    public final er70 f275271b;

    /* JADX INFO: renamed from: c */
    public final wg61 f275272c = new wg61(new wep(this, 10));

    /* JADX INFO: renamed from: d */
    public final iwr f275273d = new iwr();

    public yqp(e1f0 e1f0Var, er70 er70Var) {
        this.f275270a = e1f0Var;
        this.f275271b = er70Var;
    }

    /* JADX INFO: renamed from: a */
    public final CompletableSubject m94391a(String str) {
        CompletableSubject completableSubjectM23801B = CompletableSubject.m23801B();
        ((arp) m94392b()).f19116b.f20241b.put(str, completableSubjectM23801B);
        ((arp) m94392b()).f19115a.accept(new z0f0(str));
        return completableSubjectM23801B;
    }

    /* JADX INFO: renamed from: b */
    public final f1f0 m94392b() {
        return (f1f0) this.f275272c.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final SingleSubject m94393c(ppg1 ppg1Var) {
        SingleSubject singleSubject = new SingleSubject();
        m94392b();
        String string = UUID.randomUUID().toString();
        ((arp) m94392b()).f19116b.f20240a.put(string, singleSubject);
        ((arp) m94392b()).f19115a.accept(new b1f0(string, ppg1Var));
        return singleSubject;
    }
}
