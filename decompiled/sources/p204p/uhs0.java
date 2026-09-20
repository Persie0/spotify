package p204p;

import android.view.View;
import com.spotify.aiplaylist.promptcreation.presentation.PromptCreationHeaderView;

/* JADX INFO: loaded from: classes3.dex */
public final class uhs0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PromptCreationHeaderView f230508b;

    public /* synthetic */ uhs0(PromptCreationHeaderView promptCreationHeaderView, int i) {
        this.f230507a = i;
        this.f230508b = promptCreationHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f230507a) {
            case 0:
                eh00 eh00Var = this.f230508b.f2755U0;
                if (eh00Var != null) {
                    eh00Var.invoke();
                    return;
                } else {
                    wj50.m88260d0("onMoreOptionsButtonClick");
                    throw null;
                }
            case 1:
                eh00 eh00Var2 = this.f230508b.f2754T0;
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                    return;
                } else {
                    wj50.m88260d0("onCloseClick");
                    throw null;
                }
            default:
                eh00 eh00Var3 = this.f230508b.f2753S0;
                if (eh00Var3 != null) {
                    eh00Var3.invoke();
                    return;
                } else {
                    wj50.m88260d0("onBackClick");
                    throw null;
                }
        }
    }
}
