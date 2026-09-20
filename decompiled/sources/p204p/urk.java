package p204p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@gtq
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lp/urk;", "Lp/my8;", "<init>", "()V", "src_main_java_com_spotify_bottomsheet_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class urk extends my8 {

    /* JADX INFO: renamed from: V1 */
    public static final /* synthetic */ qr60[] f233393V1 = {new spi0(urk.class, "systemBarInsets", "getSystemBarInsets()Landroidx/core/graphics/Insets;", 0), new spi0(urk.class, "fillWindowHeight", "getFillWindowHeight()Z", 0)};

    /* JADX INFO: renamed from: T1 */
    public final trk f233394T1 = new trk(this, 0);

    /* JADX INFO: renamed from: U1 */
    public final trk f233395U1 = new trk(this, 1);

    /* JADX INFO: renamed from: w1 */
    public static final void m83854w1(urk urkVar) {
        View view;
        trk trkVar = urkVar.f233394T1;
        qr60[] qr60VarArr = f233393V1;
        qr60 qr60Var = qr60VarArr[0];
        dx40 dx40Var = (dx40) trkVar.f61172a;
        if (dx40Var == null || (view = urkVar.f98706h1) == null) {
            return;
        }
        trk trkVar2 = urkVar.f233395U1;
        qr60 qr60Var2 = qr60VarArr[1];
        view.setMinimumHeight(((Boolean) trkVar2.f61172a).booleanValue() ? ((Number) urkVar.f148353Q1.getValue()).intValue() - dx40Var.f53849b : 0);
        if (view.isInLayout()) {
            view.post(new RunnableC1978ih(view, 1));
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMo34386x1 = mo34386x1(layoutInflater, viewGroup);
        ydi ydiVarM93433r = ydi.m93433r(layoutInflater, viewGroup);
        EncoreViewStub encoreViewStub = (EncoreViewStub) ydiVarM93433r.f271775c;
        View view = viewMo34386x1;
        if (getF148354R1()) {
            NestedScrollView nestedScrollView = new NestedScrollView(m49702X0());
            nestedScrollView.addView(viewMo34386x1);
            view = nestedScrollView;
        }
        psg1.m70832H(encoreViewStub, view);
        return ydiVarM93433r.m93436q();
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: v1 */
    public final void mo50804v1(dx40 dx40Var) {
        this.f233394T1.m39516c(f233393V1[0], this, dx40Var);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract View mo34386x1(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
