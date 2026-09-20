package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class kvv0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2242p3 f126969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kvv0(C2242p3 c2242p3, int i) {
        super(0);
        this.f126968a = i;
        this.f126969b = c2242p3;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f126968a) {
            case 0:
                return C2242p3.m68973b(this.f126969b, R.drawable.encore_icon_repeat, true);
            case 1:
                return C2242p3.m68973b(this.f126969b, R.drawable.encore_icon_repeat, false);
            case 2:
                return C2242p3.m68973b(this.f126969b, R.drawable.encore_icon_repeat_once, true);
            default:
                ((iwr) this.f126969b.f173490g).m51847a();
                return w2a1.f247311a;
        }
    }
}
