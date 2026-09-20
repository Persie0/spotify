package p204p;

import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: classes6.dex */
public final class xva extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EncoreButton f266322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xva(EncoreButton encoreButton, int i) {
        super(0);
        this.f266321a = i;
        this.f266322b = encoreButton;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f266321a) {
            case 0:
                break;
        }
        return Float.valueOf(this.f266322b.getAlpha());
    }
}
