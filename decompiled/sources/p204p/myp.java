package p204p;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes5.dex */
public final class myp implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f148492b;

    public /* synthetic */ myp(int i, gh00 gh00Var) {
        this.f148491a = i;
        this.f148492b = gh00Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f148491a) {
            case 0:
                this.f148492b.invoke(a3q0.f12025a);
                break;
            default:
                this.f148492b.invoke(wx71.f255962a);
                break;
        }
    }
}
