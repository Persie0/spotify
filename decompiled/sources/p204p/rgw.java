package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rgw extends urk {

    /* JADX INFO: renamed from: W1 */
    public hgw f199035W1;

    /* JADX INFO: renamed from: X1 */
    public qe70 f199036X1;

    /* JADX INFO: renamed from: Y1 */
    public qe70 f199037Y1;

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        this.f98702f1 = true;
        mo83051h1();
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: t1 */
    public final void mo38127t1(srk srkVar) {
        srkVar.m87626g().m1578L(3);
        srkVar.m87626g().m1577K(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    @Override // p204p.my8
    /* JADX INFO: renamed from: u1 */
    public final void mo41980u1() {
        ?? r0 = this.f199037Y1;
        if (r0 != 0) {
            r0.invoke();
        } else {
            wj50.m88260d0("onDismiss");
            throw null;
        }
    }

    @Override // p204p.urk
    /* JADX INFO: renamed from: x1 */
    public final View mo34386x1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pyu pyuVarM71661F = pyu.m71661F(layoutInflater, viewGroup);
        EncoreButton encoreButton = (EncoreButton) pyuVarM71661F.f183522d;
        p3h1.m69032r(pyuVarM71661F.m71666C(), acu.f14437N0);
        TextView textView = (TextView) pyuVarM71661F.f183523e;
        hgw hgwVar = this.f199035W1;
        if (hgwVar == null) {
            wj50.m88260d0("config");
            throw null;
        }
        textView.setText(m75489y1((ngw) hgwVar.m47479c().f170906a));
        TextView textView2 = (TextView) pyuVarM71661F.f183521c;
        hgw hgwVar2 = this.f199035W1;
        if (hgwVar2 == null) {
            wj50.m88260d0("config");
            throw null;
        }
        textView2.setText(m75489y1(hgwVar2.m47477a().m53308a()));
        hgw hgwVar3 = this.f199035W1;
        if (hgwVar3 == null) {
            wj50.m88260d0("config");
            throw null;
        }
        encoreButton.setText(m75489y1(hgwVar3.m47478b().m53308a()));
        encoreButton.setOnClickListener(new ryp(this, 9));
        return pyuVarM71661F.m71666C();
    }

    /* JADX INFO: renamed from: y1 */
    public final String m75489y1(ngw ngwVar) {
        if (ngwVar instanceof mgw) {
            return m49722u0(((mgw) ngwVar).f143638a);
        }
        if (ngwVar instanceof lgw) {
            return ((lgw) ngwVar).m58940a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
