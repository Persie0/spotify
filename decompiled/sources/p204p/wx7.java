package p204p;

import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes4.dex */
public final class wx7 {

    /* JADX INFO: renamed from: a */
    public final p8p0 f255960a;

    public wx7(p8p0 p8p0Var) {
        this.f255960a = p8p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m89228a(wx7 wx7Var, ibk ibkVar) {
        vx7 vx7Var;
        if (ibkVar instanceof vx7) {
            vx7Var = (vx7) ibkVar;
            int i = vx7Var.f245634c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx7Var.f245634c = i - Integer.MIN_VALUE;
            } else {
                vx7Var = new vx7(wx7Var, ibkVar);
            }
        } else {
            vx7Var = new vx7(wx7Var, ibkVar);
        }
        Object obj = vx7Var.f245632a;
        int i2 = vx7Var.f245634c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleMo48412a = wx7Var.f255960a.mo48412a(new d8p0(SkipToNextTrackCommand.builder().build()));
        vx7Var.f245634c = 1;
        Object objM96567o = zn91.m96567o(singleMo48412a, vx7Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
