package p204p;

import android.content.Context;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ni60 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f154186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u010 f154187c;

    public /* synthetic */ ni60(niz nizVar, u010 u010Var, int i) {
        this.f154185a = i;
        this.f154186b = nizVar;
        this.f154187c = u010Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        mi60 mi60Var;
        pi60 pi60Var;
        int i;
        switch (this.f154185a) {
            case 0:
                if (fbkVar instanceof mi60) {
                    mi60Var = (mi60) fbkVar;
                    int i2 = mi60Var.f143947b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mi60Var.f143947b = i2 - Integer.MIN_VALUE;
                    } else {
                        mi60Var = new mi60(this, fbkVar);
                    }
                } else {
                    mi60Var = new mi60(this, fbkVar);
                }
                Object obj2 = mi60Var.f143946a;
                int i3 = mi60Var.f143947b;
                if (i3 == 0) {
                    bga.m29073P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!(((aej0) obj) instanceof zdj0) && ((cd4) ((a660) this.f154187c.f225347d).f12703a.get()).m32346A());
                    mi60Var.f143947b = 1;
                    Object objEmit = this.f154186b.emit(boolValueOf, mi60Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof pi60) {
                    pi60Var = (pi60) fbkVar;
                    int i4 = pi60Var.f177844b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pi60Var.f177844b = i4 - Integer.MIN_VALUE;
                    } else {
                        pi60Var = new pi60(this, fbkVar);
                    }
                } else {
                    pi60Var = new pi60(this, fbkVar);
                }
                Object obj3 = pi60Var.f177843a;
                int i5 = pi60Var.f177844b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    aej0 aej0Var = (aej0) obj;
                    if (aej0Var instanceof vdj0) {
                        i = R.string.settings_jam_action_join_nearby_learn_how;
                    } else if (aej0Var instanceof wdj0) {
                        i = R.string.settings_jam_action_activate_bluetooth_to_join_nearby;
                    } else {
                        if (!(aej0Var instanceof xdj0) && !(aej0Var instanceof zdj0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.settings_jam_action_enable_bluetooth_to_join_nearby;
                    }
                    String string = ((Context) this.f154187c.f225345b).getString(i);
                    pi60Var.f177844b = 1;
                    Object objEmit2 = this.f154186b.emit(string, pi60Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
