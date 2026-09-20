package p204p;

import com.spotify.endless.sessionstarter.EndlessActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class z1v extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EndlessActivity f278421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1v(EndlessActivity endlessActivity, int i) {
        super(0);
        this.f278420a = i;
        this.f278421b = endlessActivity;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f278420a) {
            case 0:
                Serializable serializableExtra = this.f278421b.getIntent().getSerializableExtra("com.spotify.endless.sessionstarter.KEY_INTERACTION_ID");
                if (serializableExtra instanceof z650) {
                    return (z650) serializableExtra;
                }
                return null;
            default:
                this.f278421b.finish();
                return w2a1.f247311a;
        }
    }
}
