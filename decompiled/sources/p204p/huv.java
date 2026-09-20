package p204p;

import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class huv extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iuv f95465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ huv(iuv iuvVar, int i) {
        super(1);
        this.f95464a = i;
        this.f95465b = iuvVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f95464a) {
            case 0:
                d6k0 d6k0Var = (d6k0) obj;
                String str = d6k0Var.f45715a;
                ArrayList arrayList = d6k0Var.f45717c;
                return new urv(new avv(str, d6k0Var.f45718d ? this.f95465b.f106044d.getString(R.string.entity_segments_card_ml_disclaimer) : null, d6k0Var.f45716b, arrayList, d6k0Var.f45718d));
            default:
                d6k0 d6k0Var2 = (d6k0) obj;
                String str2 = d6k0Var2.f45715a;
                ArrayList arrayList2 = d6k0Var2.f45717c;
                return new urv(new avv(str2, d6k0Var2.f45718d ? this.f95465b.f106044d.getString(R.string.entity_segments_card_ml_disclaimer) : null, d6k0Var2.f45716b, arrayList2, d6k0Var2.f45718d));
        }
    }
}
