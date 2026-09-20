package p204p;

import android.text.Editable;
import com.spotify.allboarding.allboardingimpl.search.p018ui.ToolbarSearchFieldView;
import com.spotify.mobius.functions.Consumer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class s09 extends xf71 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f204320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f204321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s09(Object obj, int i) {
        super(0);
        this.f204320b = i;
        this.f204321c = obj;
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f204320b) {
            case 0:
                nh61 nh61Var = (nh61) this.f204321c;
                String string = editable != null ? editable.toString() : null;
                ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) nh61Var.f153887e;
                Iterator it = ((CopyOnWriteArraySet) nh61Var.f153884b).iterator();
                while (it.hasNext()) {
                    ((ruy0) it.next()).mo57576c(string);
                }
                boolean z = string == null || string.length() == 0;
                toolbarSearchFieldView.getClass();
                toolbarSearchFieldView.setRightButtonVisible(!z);
                break;
            default:
                super.afterTextChanged(editable);
                break;
        }
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f204320b) {
            case 1:
                ((Consumer) this.f204321c).accept(new f9n0(charSequence.toString(), false));
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}
