package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes9.dex */
public final class tsp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ usp f223397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsp(usp uspVar) {
        super(0);
        this.f223397a = uspVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        MobiusLoop.Controller controller = this.f223397a.f233662c;
        if (controller != null) {
            return (w8z) controller.mo15602a();
        }
        return null;
    }
}
