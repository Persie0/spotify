package p204p;

import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: classes6.dex */
public final class zva extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EncoreButton f286662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zva(EncoreButton encoreButton, int i) {
        super(1);
        this.f286661a = i;
        this.f286662b = encoreButton;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f286661a) {
            case 0:
                this.f286662b.setAlpha(((Number) obj).floatValue());
                break;
            case 1:
                this.f286662b.setAlpha(((Number) obj).floatValue());
                break;
            case 2:
                this.f286662b.setAlpha(((Number) obj).floatValue());
                break;
            default:
                this.f286662b.setAlpha(((Number) obj).floatValue());
                break;
        }
        return w2a1.f247311a;
    }
}
