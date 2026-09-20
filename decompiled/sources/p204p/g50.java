package p204p;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76557a;

    /* JADX INFO: renamed from: b */
    public boolean f76558b;

    /* JADX INFO: renamed from: c */
    public Object f76559c;

    /* JADX INFO: renamed from: a */
    public Integer mo43564a(g50 g50Var) {
        mec0 mec0Var = wpc1.f253742a;
        if (this == g50Var) {
            return 0;
        }
        mec0 mec0Var2 = wpc1.f253742a;
        Integer num = (Integer) mec0Var2.get(this);
        Integer num2 = (Integer) mec0Var2.get(g50Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo43565b();

    /* JADX INFO: renamed from: c */
    public abstract View mo43566c();

    /* JADX INFO: renamed from: d */
    public String mo43567d() {
        return (String) this.f76559c;
    }

    /* JADX INFO: renamed from: e */
    public abstract zge0 mo43568e();

    /* JADX INFO: renamed from: f */
    public abstract MenuInflater mo43569f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo43570g();

    /* JADX INFO: renamed from: h */
    public abstract CharSequence mo43571h();

    /* JADX INFO: renamed from: i */
    public abstract void mo43572i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo43573j();

    /* JADX INFO: renamed from: l */
    public abstract void mo43575l(View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo43576n(int i);

    /* JADX INFO: renamed from: o */
    public abstract void mo43577o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public abstract void mo43578p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo43579q(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public abstract void mo43580s(boolean z);

    public String toString() {
        switch (this.f76557a) {
            case 2:
                return mo43567d();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g50(Object obj, boolean z, int i) {
        this.f76557a = i;
        this.f76559c = obj;
        this.f76558b = z;
    }

    /* JADX INFO: renamed from: k */
    public g50 mo43574k() {
        return this;
    }
}
