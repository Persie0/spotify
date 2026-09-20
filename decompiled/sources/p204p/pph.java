package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class pph {

    /* JADX INFO: renamed from: a */
    public boolean f180044a;

    /* JADX INFO: renamed from: b */
    public Object f180045b;

    public pph(hg50 hg50Var) {
        this.f180045b = hg50Var;
        this.f180044a = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo70575a() {
        this.f180044a = true;
    }

    /* JADX INFO: renamed from: b */
    public void mo70576b() {
        this.f180044a = false;
    }

    /* JADX INFO: renamed from: c */
    public void mo70577c() {
        this.f180044a = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo70578d(byte b) {
        ((hg50) this.f180045b).writeLong(b);
    }

    /* JADX INFO: renamed from: e */
    public void m70579e(char c) {
        ((hg50) this.f180045b).mo33242i(c);
    }

    /* JADX INFO: renamed from: f */
    public void mo70580f(int i) {
        ((hg50) this.f180045b).writeLong(i);
    }

    /* JADX INFO: renamed from: g */
    public void mo70581g(long j) {
        ((hg50) this.f180045b).writeLong(j);
    }

    /* JADX INFO: renamed from: h */
    public void m70582h(String str) {
        ((hg50) this.f180045b).mo33249s(str);
    }

    /* JADX INFO: renamed from: i */
    public void mo70583i(short s) {
        ((hg50) this.f180045b).writeLong(s);
    }

    /* JADX INFO: renamed from: j */
    public void mo70584j(String str) {
        ((hg50) this.f180045b).mo33248r(str);
    }

    /* JADX INFO: renamed from: m */
    public void m70587m(zig1 zig1Var) {
        if (this.f180044a) {
            mmf1.m62314h();
            return;
        }
        try {
            ((hd91) this.f180045b).m47180b(s08.m76856a(zig1Var));
        } catch (Throwable unused) {
            mmf1.m62314h();
        }
    }

    public pph(List list, boolean z) {
        this.f180045b = list;
        this.f180044a = z;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo70585k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo70586l() {
    }
}
