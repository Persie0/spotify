package p204p;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.concertpageview.p048v1.GetConcertPageResponse;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k6i extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f119760h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6i(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f119760h = i4;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [p.gh00, p.mb61] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f119760h;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f78014b;
        switch (i) {
            case 0:
                return ((cfi) obj2).apply((GetConcertPageResponse) obj);
            case 1:
                ((Consumer) obj2).accept((nai) obj);
                return w2a1Var;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                ConstraintLayout constraintLayout = ((cei) obj2).f37133c.f187695c;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + iIntValue, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                return w2a1Var;
            case 3:
                ((ht4) obj2).m48571a((String) obj);
                return w2a1Var;
            case 4:
                return q3j.m72122a((q3j) obj2, (fbk) obj);
            case 5:
                rh20 rh20Var = (rh20) obj;
                xaj xajVar = (xaj) obj2;
                Context context = xajVar.f259700a;
                cyo cyoVar = xajVar.f259701b;
                if (rh20Var instanceof qh20) {
                    hvi0 hvi0Var = cks.f39079b;
                    return cyoVar.m34388a(cks.m33199r(jwg1.m54450E(((qh20) rh20Var).f188602a, ils.MILLISECONDS), ils.SECONDS));
                }
                if (!(rh20Var instanceof ph20)) {
                    if (!rh20Var.equals(oh20.f165315a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string = context.getString(R.string.audiobook_finished);
                    wj50.m88279p(string);
                    return string;
                }
                ph20 ph20Var = (ph20) rh20Var;
                long j = ph20Var.f177447b - ph20Var.f177446a;
                hvi0 hvi0Var2 = cks.f39079b;
                String string2 = context.getString(R.string.audiobook_header_time_left, cyoVar.m34388a(cks.m33199r(jwg1.m54450E(j, ils.MILLISECONDS), ils.SECONDS)));
                wj50.m88279p(string2);
                return string2;
            case 6:
                upj upjVar = (upj) obj2;
                upjVar.getClass();
                upjVar.m83710a(new znj((jyn0) obj, true));
                return w2a1Var;
            case 7:
                upj upjVar2 = (upj) obj2;
                upjVar2.getClass();
                upjVar2.m83710a(new ynj((xyn0) obj));
                return w2a1Var;
            case 8:
                upj upjVar3 = (upj) obj2;
                upjVar3.getClass();
                upjVar3.m83710a(new ynj((xyn0) obj));
                return w2a1Var;
            case 9:
                ((y951) obj2).m93148a((cb51) obj);
                return w2a1Var;
            case 10:
                Bundle bundle = (Bundle) obj;
                zwk zwkVar = (zwk) obj2;
                zwkVar.getClass();
                xwk xwkVar = bundle != null ? (xwk) zn91.m96523K(bundle, "VM_STATE_KEY", xwk.class) : null;
                return xwkVar == null ? new xwk(zwkVar.f286997b, "", lau.f131415a) : xwkVar;
            case 11:
                ((zwk) obj2).getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("VM_STATE_KEY", (xwk) obj);
                return bundle2;
            case 12:
                return Float.valueOf(((TextPaint) obj2).measureText((String) obj));
            case 13:
                return ((gw80) obj2).mo26956a((List) obj);
            case 14:
                pxl pxlVar = (pxl) obj;
                wxl wxlVar = (wxl) obj2;
                if (!wxlVar.f256061a.m92921o()) {
                    return new rxl(pxlVar.f182334e, pxlVar.f182335f, pxlVar.f182336g, pxlVar.f182338i, pxlVar.f182339j, pxlVar.f182340k, null, pxlVar.f182332c, pxlVar.f182333d, pxlVar.f182331b, pxlVar.f182330a);
                }
                lxl lxlVarM46114a = wxlVar.f256062b.f277269a.m46114a(pxlVar.f182341l.f159509a);
                if (!(lxlVarM46114a instanceof jxl)) {
                    return lxlVarM46114a instanceof ixl ? qxl.f193702a : new sxl(null);
                }
                jxl jxlVar = (jxl) lxlVarM46114a;
                pxl pxlVar2 = jxlVar.f117152a;
                return new rxl(pxlVar2.f182334e, pxlVar2.f182335f, pxlVar2.f182336g, pxlVar2.f182338i, pxlVar2.f182339j, pxlVar2.f182340k, jxlVar.f117153b, pxlVar.f182332c, pxlVar.f182333d, pxlVar.f182331b, pxlVar.f182330a);
            case 15:
                return ((m1m) obj2).f139031c.m66075a((String) obj).map(y5i0.f269449Q0).toMaybe();
            case 16:
                return ((d6m) obj2).f45725a.invoke((fbk) obj);
            case 17:
                int iIntValue2 = ((Number) obj).intValue();
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ((v4p) obj2).f237215b.f121498b;
                wj50.m88279p(constraintLayout2);
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop() + iIntValue2, constraintLayout2.getPaddingRight(), constraintLayout2.getPaddingBottom());
                return w2a1Var;
            case 18:
                j5p j5pVar = (j5p) obj2;
                j5pVar.f109038S0 = ((Number) obj).intValue();
                j5pVar.m52469q();
                return w2a1Var;
            case 19:
                ((h7p) obj2).m46777b((x7q) obj);
                return w2a1Var;
            case 20:
                int iIntValue3 = ((Number) obj).intValue();
                ugz ugzVar = ((pop) obj2).f179741b;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ugzVar.f230293e;
                int paddingLeft = constraintLayout3.getPaddingLeft();
                ConstraintLayout constraintLayout4 = (ConstraintLayout) ugzVar.f230293e;
                constraintLayout3.setPadding(paddingLeft, constraintLayout4.getPaddingTop() + iIntValue3, constraintLayout4.getPaddingRight(), constraintLayout4.getPaddingBottom());
                return w2a1Var;
            case 21:
                ((ReplayProcessor) obj2).onNext((ezk) obj);
                return w2a1Var;
            case 22:
                return Boolean.valueOf(((s0q) obj2).f204495a.contains(sx50.m79578a(((cx50) obj).m34218b())));
            case 23:
                return Boolean.valueOf(((t0q) obj2).f215956a.contains(sx50.m79578a(((cx50) obj).m34218b())));
            case 24:
                int iIntValue4 = ((Number) obj).intValue();
                fxr0 fxr0Var = ((k1q) obj2).f118409c;
                ConstraintLayout constraintLayout5 = fxr0Var.f74440d1;
                constraintLayout5.setPadding(constraintLayout5.getPaddingLeft(), constraintLayout5.getPaddingTop() + iIntValue4, constraintLayout5.getPaddingRight(), constraintLayout5.getPaddingBottom());
                View view = fxr0Var.f74430Y0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = -fxr0Var.f74440d1.getPaddingTop();
                view.setLayoutParams(marginLayoutParams);
                return w2a1Var;
            case 25:
                o4q o4qVar = (o4q) obj2;
                o4qVar.getClass();
                fbk fbkVar = null;
                return xtm0.m92074U(new nzx0(new fol(obj, (Object) o4qVar, false, fbkVar, 16)), new eud(fbkVar, o4qVar, 19));
            case 26:
                int iIntValue5 = ((Number) obj).intValue();
                ConstraintLayout constraintLayout6 = ((jfj) obj2).f111912a;
                constraintLayout6.setPadding(constraintLayout6.getPaddingLeft(), constraintLayout6.getPaddingTop() + iIntValue5, constraintLayout6.getPaddingRight(), constraintLayout6.getPaddingBottom());
                return w2a1Var;
            case 27:
                int iIntValue6 = ((Number) obj).intValue();
                ConstraintLayout constraintLayout7 = ((vfq) obj2).f241013d.f187695c;
                constraintLayout7.setPadding(constraintLayout7.getPaddingLeft(), constraintLayout7.getPaddingTop() + iIntValue6, constraintLayout7.getPaddingRight(), constraintLayout7.getPaddingBottom());
                return w2a1Var;
            case 28:
                return ((jxq) obj2).m54712o((String) obj);
            default:
                return new dyq((fyq) obj2, (ld70) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6i(TextPaint textPaint) {
        super(1, textPaint, TextPaint.class, "measureText", "measureText(Ljava/lang/String;)F", 0, 0);
        this.f119760h = 12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6i(zwk zwkVar, int i) {
        super(1, zwkVar, zwk.class, "createModel", "createModel(Landroid/os/Bundle;)Lcom/spotify/checkout/countrypickerimpl/domain/CountryPickerModel;", 0, 0);
        this.f119760h = i;
        switch (i) {
            case 11:
                super(1, zwkVar, zwk.class, "saveModel", "saveModel(Lcom/spotify/checkout/countrypickerimpl/domain/CountryPickerModel;)Landroid/os/Bundle;", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6i(h7p h7pVar) {
        super(1, h7pVar, h7p.class, "onDismiss", "onDismiss(Lcom/spotify/connect/smartcontrol/smartcontrolimpl/DefaultSmartControlHandle;)V", 0, 0);
        this.f119760h = 19;
    }
}
