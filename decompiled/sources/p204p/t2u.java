package p204p;

import android.text.Editable;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class t2u extends xf71 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f216624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Consumer f216625c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Connectable f216626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2u(Connectable connectable, Consumer consumer, int i) {
        super(0);
        this.f216624b = i;
        this.f216626d = connectable;
        this.f216625c = consumer;
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f216624b) {
            case 1:
                iub0 iub0Var = (iub0) this.f216626d;
                if (!iub0Var.f105913S0) {
                    iub0Var.f105913S0 = true;
                    sfa0 sfa0Var = iub0Var.f105921e;
                    cvg0 cvg0Var = iub0Var.f105922f;
                    cvg0Var.getClass();
                    yt91 yt91VarM96903c = cvg0Var.f42427a.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("email_field", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    sfa0 sfa0Var2 = sfa0Var;
                    sfa0Var2.mo57452p(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
                }
                this.f216625c.accept(new sw40(editable.toString()));
                break;
            default:
                super.afterTextChanged(editable);
                break;
        }
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f216624b) {
            case 0:
                if (((u2u) this.f216626d).f226173e.isEnabled()) {
                    this.f216625c.accept(new t0u(wl51.m88491o1(charSequence).toString(), false));
                }
                break;
            case 1:
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
            case 2:
                this.f216625c.accept(new fui0(charSequence.toString(), ((bvi0) this.f216626d).f31378g.hasFocus()));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2u(Consumer consumer, bvi0 bvi0Var) {
        super(0);
        this.f216624b = 2;
        this.f216625c = consumer;
        this.f216626d = bvi0Var;
    }
}
