package p204p;

import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class t6e implements yf0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217539a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChoiceScreenUcActivity f217540b;

    public /* synthetic */ t6e(ChoiceScreenUcActivity choiceScreenUcActivity, int i) {
        this.f217539a = i;
        this.f217540b = choiceScreenUcActivity;
    }

    @Override // p204p.yf0
    /* JADX INFO: renamed from: a */
    public final void mo25836a(Object obj) {
        int i = this.f217539a;
        ChoiceScreenUcActivity choiceScreenUcActivity = this.f217540b;
        switch (i) {
            case 0:
                q6e q6eVar = ChoiceScreenUcActivity.f4108w1;
                choiceScreenUcActivity.m11166q0().m15621f(new r8e((om10) obj));
                break;
            case 1:
                q6e q6eVar2 = ChoiceScreenUcActivity.f4108w1;
                choiceScreenUcActivity.m11166q0().m15621f(new z8e((wb41) obj));
                break;
            default:
                mwk mwkVar = (mwk) obj;
                if (mwkVar != null) {
                    q6e q6eVar3 = ChoiceScreenUcActivity.f4108w1;
                    choiceScreenUcActivity.m11166q0().m15621f(new m8e(mwkVar));
                }
                break;
        }
    }
}
