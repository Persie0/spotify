package p204p;

import android.os.Parcelable;
import android.os.SystemClock;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ChipsField;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$DropdownField;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$FormField;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$InputField;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$PciField;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ResponseAction;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class cen0 {

    /* JADX INFO: renamed from: a */
    public final wen0 f37161a;

    public cen0(wen0 wen0Var) {
        this.f37161a = wen0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final m3x0 m32588a(cen0 cen0Var, PaymentSdkNativeServiceProto$ResponseAction paymentSdkNativeServiceProto$ResponseAction) {
        y2x0 y2x0Var;
        a3x0 a3x0Var;
        z2x0 z2x0Var;
        int iM16852w = paymentSdkNativeServiceProto$ResponseAction != null ? paymentSdkNativeServiceProto$ResponseAction.m16852w() : 0;
        switch (iM16852w == 0 ? -1 : vdn0.f240452e[edb.m38547C(iM16852w)]) {
            case 1:
                return new e3x0(paymentSdkNativeServiceProto$ResponseAction.m16848s().m16888o());
            case 2:
                return new w2x0(paymentSdkNativeServiceProto$ResponseAction.m16846q().getMessage(), paymentSdkNativeServiceProto$ResponseAction.m16846q().m16858o());
            case 3:
                return new h3x0(paymentSdkNativeServiceProto$ResponseAction.m16850u().getMessage(), paymentSdkNativeServiceProto$ResponseAction.m16850u().m16894o());
            case 4:
                return new t2x0(paymentSdkNativeServiceProto$ResponseAction.m16845o().getMessage(), paymentSdkNativeServiceProto$ResponseAction.m16845o().m16856o());
            case 5:
                return u2x0.f226192a;
            case 6:
                return new k3x0(dks.m36313b(paymentSdkNativeServiceProto$ResponseAction.m16853x().m16898o()));
            case 7:
                dks dksVarM36313b = dks.m36313b(paymentSdkNativeServiceProto$ResponseAction.m16849t().m16892q());
                String strM16891p = paymentSdkNativeServiceProto$ResponseAction.m16849t().m16891p();
                String strM16890n = paymentSdkNativeServiceProto$ResponseAction.m16849t().m16890n();
                return new g3x0(dksVarM36313b, strM16891p, strM16890n.length() != 0 ? strM16890n : null);
            case 8:
                String strM16864s = paymentSdkNativeServiceProto$ResponseAction.m16847r().m16864s();
                String strM16860n = paymentSdkNativeServiceProto$ResponseAction.m16847r().m16860n();
                ae50<PaymentSdkNativeServiceProto$ResponseAction.DisplayPending.Step> ae50VarM16866u = paymentSdkNativeServiceProto$ResponseAction.m16847r().m16866u();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16866u, 10));
                for (PaymentSdkNativeServiceProto$ResponseAction.DisplayPending.Step step : ae50VarM16866u) {
                    String title = step.getTitle();
                    String strM16885n = step.m16885n();
                    int i = 1;
                    switch (step.m16886o()) {
                        case ENCORE_ICON_UNKNOWN:
                        case ENCORE_ICON_CHECK_ALT:
                        case UNRECOGNIZED:
                            break;
                        case ENCORE_ICON_UNDO:
                            i = 2;
                            break;
                        case ENCORE_ICON_EXTERNAL_LINK:
                            i = 3;
                            break;
                        case ENCORE_ICON_CAMERA:
                            i = 4;
                            break;
                        case ENCORE_ICON_MESSAGES:
                            i = 5;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(new b3x0(title, strM16885n, i));
                }
                qf40 qf40VarM67574x = opo.m67574x(arrayList);
                PaymentSdkNativeServiceProto$ResponseAction.DisplayPending.DeferredRequest deferredRequestM16861p = paymentSdkNativeServiceProto$ResponseAction.m16847r().m16861p();
                if (!paymentSdkNativeServiceProto$ResponseAction.m16847r().m16867v()) {
                    deferredRequestM16861p = null;
                }
                if (deferredRequestM16861p != null) {
                    dks dksVarM36313b2 = dks.m36313b(deferredRequestM16861p.m16873p());
                    PaymentSdkNativeServiceProto$ResponseAction.DisplayPending.DeferredRequest.Countdown countdownM16872n = deferredRequestM16861p.m16872n();
                    if (!deferredRequestM16861p.m16874q()) {
                        countdownM16872n = null;
                    }
                    y2x0Var = new y2x0(dksVarM36313b2, countdownM16872n != null ? new x2x0((countdownM16872n.m16877o() * ((long) 1000)) + SystemClock.elapsedRealtime(), countdownM16872n.m16876n()) : null);
                } else {
                    y2x0Var = null;
                }
                PaymentSdkNativeServiceProto$ResponseAction.DisplayPending.QrCode qrCodeM16865t = paymentSdkNativeServiceProto$ResponseAction.m16847r().m16865t();
                if (!paymentSdkNativeServiceProto$ResponseAction.m16847r().m16870y()) {
                    qrCodeM16865t = null;
                }
                if (qrCodeM16865t != null) {
                    String strM16883o = qrCodeM16865t.m16883o();
                    String strM16884p = qrCodeM16865t.m16884p();
                    if (strM16884p.length() == 0) {
                        strM16884p = null;
                    }
                    a3x0Var = new a3x0(strM16883o, strM16884p);
                } else {
                    a3x0Var = null;
                }
                PaymentSdkNativeServiceProto$ResponseAction.DisplayPending.Form formM16863r = paymentSdkNativeServiceProto$ResponseAction.m16847r().m16863r();
                if (!paymentSdkNativeServiceProto$ResponseAction.m16847r().m16869x()) {
                    formM16863r = null;
                }
                if (formM16863r != null) {
                    String id = formM16863r.getId();
                    String strM16879n = formM16863r.m16879n();
                    ae50<PaymentSdkNativeServiceProto$FormField> ae50VarM16881q = formM16863r.m16881q();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM16881q, 10));
                    for (PaymentSdkNativeServiceProto$FormField paymentSdkNativeServiceProto$FormField : ae50VarM16881q) {
                        wj50.m88279p(paymentSdkNativeServiceProto$FormField);
                        arrayList2.add(m32589b(paymentSdkNativeServiceProto$FormField));
                    }
                    qf40 qf40VarM67574x2 = opo.m67574x(arrayList2);
                    String strM16880p = formM16863r.m16880p();
                    if (strM16880p.length() == 0) {
                        strM16880p = null;
                    }
                    z2x0Var = new z2x0(id, strM16879n, strM16880p, qf40VarM67574x2);
                } else {
                    z2x0Var = null;
                }
                return new c3x0(strM16864s, strM16860n, qf40VarM67574x, y2x0Var, a3x0Var, z2x0Var, paymentSdkNativeServiceProto$ResponseAction.m16847r().m16868w() ? paymentSdkNativeServiceProto$ResponseAction.m16847r().m16862q() : null);
            case 9:
                return f3x0.f65608a;
            case 10:
                return r2x0.f195247a;
            case 11:
                String url = paymentSdkNativeServiceProto$ResponseAction.m16851v().getUrl();
                String strM16896n = paymentSdkNativeServiceProto$ResponseAction.m16851v().m16896n();
                return new i3x0(url, strM16896n.length() != 0 ? strM16896n : null);
            case 12:
                return new s2x0(paymentSdkNativeServiceProto$ResponseAction.m16844n().getUrl());
            default:
                return d3x0.f45025a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static uuy m32589b(PaymentSdkNativeServiceProto$FormField paymentSdkNativeServiceProto$FormField) {
        int i;
        Parcelable ww40Var;
        String id;
        int iM16730q = paymentSdkNativeServiceProto$FormField.m16730q();
        int i2 = 3;
        String str = "";
        switch (iM16730q == 0 ? -1 : vdn0.f240451d[edb.m38547C(iM16730q)]) {
            case 1:
                String name = paymentSdkNativeServiceProto$FormField.m16732s().getName();
                String strM16745q = paymentSdkNativeServiceProto$FormField.m16732s().m16745q();
                int i3 = vdn0.f240448a[paymentSdkNativeServiceProto$FormField.m16732s().m16748t().ordinal()];
                if (i3 == 1) {
                    i = 2;
                } else if (i3 == 2) {
                    i = 3;
                } else if (i3 != 3) {
                    i = i3 != 4 ? 1 : 5;
                } else {
                    i = 4;
                }
                String strM16746r = paymentSdkNativeServiceProto$FormField.m16732s().m16746r();
                String strM16743o = paymentSdkNativeServiceProto$FormField.m16732s().m16743o();
                String str2 = strM16743o.length() == 0 ? null : strM16743o;
                ae50<PaymentSdkNativeServiceProto$InputField.InputValidationRule> ae50VarM16749u = paymentSdkNativeServiceProto$FormField.m16732s().m16749u();
                ArrayList arrayList = new ArrayList();
                for (PaymentSdkNativeServiceProto$InputField.InputValidationRule inputValidationRule : ae50VarM16749u) {
                    int iM16753q = inputValidationRule.m16753q();
                    int i4 = iM16753q == 0 ? -1 : vdn0.f240449b[edb.m38547C(iM16753q)];
                    if (i4 == 1) {
                        ww40Var = new ww40(inputValidationRule.m16751o().m16755o(), inputValidationRule.m16750n());
                    } else if (i4 == 2) {
                        ww40Var = new yw40(inputValidationRule.m16752p().m16757o(), inputValidationRule.m16750n());
                    } else if (i4 == i2) {
                        ww40Var = new zw40(inputValidationRule.m16750n());
                    } else if (i4 != 4) {
                        ww40Var = i4 != 5 ? null : new xw40(inputValidationRule.m16750n());
                    } else {
                        ww40Var = new vw40(inputValidationRule.m16750n());
                    }
                    if (ww40Var != null) {
                        arrayList.add(ww40Var);
                    }
                    i2 = 3;
                }
                qf40 qf40VarM67574x = opo.m67574x(arrayList);
                String strM16747s = paymentSdkNativeServiceProto$FormField.m16732s().m16747s();
                String str3 = strM16747s.length() == 0 ? null : strM16747s;
                String strM16744p = paymentSdkNativeServiceProto$FormField.m16732s().m16744p();
                return new ruy(name, strM16745q, i, strM16746r, str2, qf40VarM67574x, str3, null, strM16744p == null ? "" : strM16744p);
            case 2:
                int i5 = vdn0.f240450c[paymentSdkNativeServiceProto$FormField.m16734u().m16901p().ordinal()];
                return new tuy(paymentSdkNativeServiceProto$FormField.m16734u().m16900n(), i5 != 1 ? i5 != 2 ? 2 : 1 : 3);
            case 3:
                String strM16721q = paymentSdkNativeServiceProto$FormField.m16729p().m16721q();
                String name2 = paymentSdkNativeServiceProto$FormField.m16729p().getName();
                ae50<PaymentSdkNativeServiceProto$DropdownField.DropdownChoice> ae50VarM16719n = paymentSdkNativeServiceProto$FormField.m16729p().m16719n();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM16719n, 10));
                for (PaymentSdkNativeServiceProto$DropdownField.DropdownChoice dropdownChoice : ae50VarM16719n) {
                    arrayList2.add(new ais(dropdownChoice.m16722n(), dropdownChoice.getId()));
                }
                qf40 qf40VarM67574x2 = opo.m67574x(arrayList2);
                String strM16720p = paymentSdkNativeServiceProto$FormField.m16729p().m16720p();
                if (strM16720p.length() == 0) {
                    strM16720p = null;
                }
                if (strM16720p == null) {
                    PaymentSdkNativeServiceProto$DropdownField.DropdownChoice dropdownChoice2 = (PaymentSdkNativeServiceProto$DropdownField.DropdownChoice) g6f.m43745s0(paymentSdkNativeServiceProto$FormField.m16729p().m16719n());
                    id = dropdownChoice2 != null ? dropdownChoice2.getId() : null;
                    if (id != null) {
                        str = id;
                    }
                } else {
                    str = strM16720p;
                }
                return new puy(strM16721q, name2, str, qf40VarM67574x2);
            case 4:
                String strM16716q = paymentSdkNativeServiceProto$FormField.m16728o().m16716q();
                String name3 = paymentSdkNativeServiceProto$FormField.m16728o().getName();
                ae50<PaymentSdkNativeServiceProto$ChipsField.ChipsChoice> ae50VarM16714n = paymentSdkNativeServiceProto$FormField.m16728o().m16714n();
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM16714n, 10));
                for (PaymentSdkNativeServiceProto$ChipsField.ChipsChoice chipsChoice : ae50VarM16714n) {
                    arrayList3.add(new g6e(chipsChoice.m16717n(), chipsChoice.getId(), chipsChoice.getDescription()));
                }
                qf40 qf40VarM67574x3 = opo.m67574x(arrayList3);
                String strM16715p = paymentSdkNativeServiceProto$FormField.m16728o().m16715p();
                if (strM16715p.length() == 0) {
                    strM16715p = null;
                }
                if (strM16715p == null) {
                    PaymentSdkNativeServiceProto$ChipsField.ChipsChoice chipsChoice2 = (PaymentSdkNativeServiceProto$ChipsField.ChipsChoice) g6f.m43745s0(paymentSdkNativeServiceProto$FormField.m16728o().m16714n());
                    id = chipsChoice2 != null ? chipsChoice2.getId() : null;
                    if (id != null) {
                        str = id;
                    }
                } else {
                    str = strM16715p;
                }
                return new ouy(strM16716q, name3, str, qf40VarM67574x3);
            case 5:
                String name4 = paymentSdkNativeServiceProto$FormField.m16727n().getName();
                String strM16712p = paymentSdkNativeServiceProto$FormField.m16727n().m16712p();
                String strM16711o = paymentSdkNativeServiceProto$FormField.m16727n().m16711o();
                return new nuy(name4, strM16712p, strM16711o.length() != 0 ? strM16711o : null);
            case 6:
                return new quy(paymentSdkNativeServiceProto$FormField.m16731r().m16741n());
            case 7:
                PaymentSdkNativeServiceProto$PciField paymentSdkNativeServiceProto$PciFieldM16733t = paymentSdkNativeServiceProto$FormField.m16733t();
                PaymentSdkNativeServiceProto$PciField.PciTranslations pciTranslationsM16795v = paymentSdkNativeServiceProto$PciFieldM16733t.m16795v();
                PaymentSdkNativeServiceProto$PciField.PciErrorMessages pciErrorMessagesM16791r = paymentSdkNativeServiceProto$PciFieldM16733t.m16791r();
                return new suy(paymentSdkNativeServiceProto$PciFieldM16733t.getName(), paymentSdkNativeServiceProto$PciFieldM16733t.m16796w(), opo.m67574x(paymentSdkNativeServiceProto$PciFieldM16733t.m16794u()), new chn0(pciTranslationsM16795v.m16808p(), pciTranslationsM16795v.m16815x(), pciTranslationsM16795v.m16812u(), pciTranslationsM16795v.m16813v(), pciTranslationsM16795v.m16814w(), pciTranslationsM16795v.m16809q(), pciTranslationsM16795v.m16806n(), pciTranslationsM16795v.m16807o(), pciTranslationsM16795v.m16810r(), pciTranslationsM16795v.m16811s(), pciTranslationsM16795v.m16816y(), pciTranslationsM16795v.m16817z()), new jgn0(pciErrorMessagesM16791r.m16800q(), pciErrorMessagesM16791r.m16802s(), pciErrorMessagesM16791r.m16803t(), pciErrorMessagesM16791r.m16798o(), pciErrorMessagesM16791r.m16799p(), pciErrorMessagesM16791r.m16801r(), pciErrorMessagesM16791r.m16804u()), paymentSdkNativeServiceProto$PciFieldM16733t.m16792s(), paymentSdkNativeServiceProto$PciFieldM16733t.m16790q(), paymentSdkNativeServiceProto$PciFieldM16733t.m16789o(), paymentSdkNativeServiceProto$PciFieldM16733t.m16788n(), paymentSdkNativeServiceProto$PciFieldM16733t.m16793t(), 1, 0.0d);
            default:
                throw new IllegalArgumentException(dq60.m36610j(PaymentSdkNativeServiceProto$FormField.class, "Unexpected field type: "));
        }
    }
}
