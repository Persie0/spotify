package p204p;

import com.spotify.libs.connect.events.proto.ConnectPossibleVolumeSpike;
import com.spotify.messages.PreloadStatusErrorNonAuth;
import java.text.SimpleDateFormat;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class u7p {

    /* JADX INFO: renamed from: a */
    public final qre0 f227737a;

    public /* synthetic */ u7p(qre0 qre0Var) {
        this.f227737a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m82527a(int i, String str) {
        String str2;
        hiq0 hiq0VarM14345p = PreloadStatusErrorNonAuth.m14345p();
        if (i == 1) {
            str2 = "PAI_INSTALL_REFERRER_DISCONNECTED";
        } else if (i == 2) {
            str2 = "PAI_INSTALL_REFERRER_NOT_READY";
        } else if (i == 3) {
            str2 = "PAI_INSTALL_REFERRER_REMOTE_EXCEPTION";
        } else if (i == 4) {
            str2 = "PAI_INSTALL_REFERRER_REPSONSE_NOT_OK";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "PAI_SECURITY_EXCEPTION";
        }
        hiq0VarM14345p.m47638q(str2);
        hiq0VarM14345p.m47637m(str);
        this.f227737a.m73616a(hiq0VarM14345p.build());
    }

    /* JADX INFO: renamed from: c */
    public void m82528c(jzc1 jzc1Var) {
        String str;
        dui duiVarM12750z = ConnectPossibleVolumeSpike.m12750z();
        duiVarM12750z.m36974m(jzc1Var.f117690a);
        duiVarM12750z.m36981w(jzc1Var.f117691b);
        duiVarM12750z.m36982x(jzc1Var.f117692c);
        duiVarM12750z.m36984z(jzc1Var.f117694e);
        duiVarM12750z.m36973A(jzc1Var.f117693d);
        sg5 sg5Var = jzc1Var.f117695f;
        SimpleDateFormat simpleDateFormat = u250.f225992a;
        int iOrdinal = sg5Var.ordinal();
        if (iOrdinal == 0) {
            str = "foreground";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "background_lockscreen";
        }
        duiVarM12750z.m36975q(str);
        duiVarM12750z.m36976r(jzc1Var.f117696g);
        duiVarM12750z.m36980v(jzc1Var.f117697h);
        duiVarM12750z.m36983y(jzc1Var.f117698i);
        duiVarM12750z.m36979u(jzc1Var.f117699j);
        duiVarM12750z.m36977s(jzc1Var.f117701l);
        duiVarM12750z.m36978t(jzc1Var.f117700k);
        this.f227737a.m73616a(duiVarM12750z.build());
    }
}
