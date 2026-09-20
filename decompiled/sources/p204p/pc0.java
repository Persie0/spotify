package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconAddBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconRemoveBadgeView;
import com.spotify.bottomsheet.core.ScrollableContentWithHeaderLayout;
import com.spotify.checkout.elements.utils.AdditionalInfoView;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutConstrainedContainerView;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutFragmentContainerView;
import com.spotify.music.R;
import com.spotify.ontour.uiusecases.elements.dateoverlay.DateOverlayView;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class pc0 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f175921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f175922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc0(int i, Object obj, Object obj2) {
        super(obj);
        this.f175921b = i;
        this.f175922c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:350:0x05f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:351:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:352:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:355:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:356:0x0601  */
    /* JADX WARN: Code duplicated, block: B:359:0x0607  */
    /* JADX WARN: Code duplicated, block: B:361:0x0626  */
    /* JADX WARN: Code duplicated, block: B:362:0x062e  */
    /* JADX WARN: Code duplicated, block: B:408:0x06fe  */
    /* JADX WARN: Type inference failed for: r10v8, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r5v20, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        CharSequence spannableStringBuilder;
        List list;
        boolean z;
        fvy fvyVar;
        fvy fvyVar2;
        fvy fvyVar3;
        boolean z2;
        ajd1 ajd1Var;
        ajd1 ajd1Var2;
        int i = this.f175921b;
        boolean z3 = false;
        Object obj3 = this.f175922c;
        switch (i) {
            case 0:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                sc0.m77759a((sc0) obj3);
                return;
            case 1:
                List list2 = (List) obj2;
                TextView textView = (TextView) ((AdditionalInfoView) obj3).f3280a.f277454c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it = list2.iterator();
                int i2 = 0;
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                        if (arrayList2 != null) {
                            Iterator it2 = arrayList2.iterator();
                            if (!it2.hasNext()) {
                                throw new UnsupportedOperationException("Empty collection can't be reduced.");
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = new SpannableStringBuilder((Spanned) next).append((CharSequence) it2.next());
                            }
                            spannableStringBuilder = (Spanned) next;
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder("");
                            }
                        } else {
                            spannableStringBuilder = new SpannableStringBuilder("");
                        }
                        textView.setText(spannableStringBuilder);
                        return;
                    }
                    Object next2 = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    String str2 = (String) next2;
                    if (i2 < list2.size() - 1) {
                        str = "<br>";
                    }
                    arrayList.add(Html.fromHtml("• " + str2 + str, 0));
                    i2 = i3;
                }
                break;
            case 2:
                sx4 sx4Var = (sx4) obj3;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (!((Boolean) obj).booleanValue() && zBooleanValue && sx4Var.getMeasuredHeight() == 0) {
                    sx4Var.f214805b.invoke();
                }
                sx4Var.requestLayout();
                return;
            case 3:
                g38 g38Var = (g38) obj3;
                dc31 dc31Var = g38Var.f76132a;
                hvy hvyVar = (hvy) obj2;
                hvy hvyVar2 = (hvy) obj;
                if (!wj50.m88271j(hvyVar2 != null ? hvyVar2.f95813b : null, hvyVar != null ? hvyVar.f95813b : null)) {
                    ((TextView) dc31Var.f47416c).setText(hvyVar != null ? hvyVar.f95813b : null);
                }
                if (!wj50.m88271j(hvyVar2 != null ? hvyVar2.f95814c : null, hvyVar != null ? hvyVar.f95814c : null)) {
                    ((TextInputLayout) dc31Var.f47417d).setError(hvyVar != null ? hvyVar.f95814c : null);
                    TextInputLayout textInputLayout = (TextInputLayout) dc31Var.f47417d;
                    String str3 = hvyVar != null ? hvyVar.f95814c : null;
                    textInputLayout.setErrorEnabled(!(str3 == null || wl51.m88460J0(str3)));
                }
                if (!wj50.m88271j(((NonCompletingAutoCompleteTextView) dc31Var.f47418e).getText().toString(), hvyVar != null ? hvyVar.f95815d : null)) {
                    g38Var.f76135d = true;
                    ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).setText((CharSequence) (hvyVar != null ? hvyVar.f95815d : null), false);
                    NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView = (NonCompletingAutoCompleteTextView) dc31Var.f47418e;
                    Editable text = nonCompletingAutoCompleteTextView.getText();
                    nonCompletingAutoCompleteTextView.setSelection(text != null ? text.length() : 0);
                    g38Var.f76135d = false;
                }
                if (!wj50.m88271j(hvyVar2 != null ? Boolean.valueOf(hvyVar2.f95817f) : null, hvyVar != null ? Boolean.valueOf(hvyVar.f95817f) : null)) {
                    ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).setCompoundDrawablesRelativeWithIntrinsicBounds((hvyVar == null || !hvyVar.f95817f) ? 0 : R.drawable.encore_icon_search, 0, 0, 0);
                }
                if (!wj50.m88271j((hvyVar2 == null || (fvyVar3 = hvyVar2.f95818g) == null) ? null : fvyVar3.f73895a, (hvyVar == null || (fvyVar2 = hvyVar.f95818g) == null) ? null : fvyVar2.f73895a)) {
                    ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).setHint((hvyVar == null || (fvyVar = hvyVar.f95818g) == null) ? null : fvyVar.f73895a);
                }
                if (!wj50.m88271j(hvyVar2 != null ? hvyVar2.f95816e : null, hvyVar != null ? hvyVar.f95816e : null)) {
                    if (hvyVar != null) {
                        list = hvyVar.f95816e;
                    } else {
                        list = null;
                    }
                    NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView2 = (NonCompletingAutoCompleteTextView) dc31Var.f47418e;
                    if (list != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nonCompletingAutoCompleteTextView2.setAutocompleteEnabled(z);
                    if (list != null) {
                        b38 b38Var = g38Var.f76133b;
                        fvy fvyVar4 = hvyVar.f95818g;
                        String str4 = fvyVar4.f73896b;
                        String str5 = fvyVar4.f73897c;
                        String str6 = fvyVar4.f73898d;
                        b38Var.f22957b = str4;
                        b38Var.f22958c = str5;
                        b38Var.f22959d = str6;
                        b38Var.f22960e = list;
                        b38Var.notifyDataSetChanged();
                        if (((NonCompletingAutoCompleteTextView) dc31Var.f47418e).hasFocus()) {
                            ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).showDropDown();
                        }
                    } else {
                        ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).dismissDropDown();
                    }
                } else if (!wj50.m88271j(hvyVar2 != null ? hvyVar2.f95818g : null, hvyVar != null ? hvyVar.f95818g : null)) {
                    if (hvyVar != null) {
                        list = hvyVar.f95816e;
                    } else {
                        list = null;
                    }
                    NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView3 = (NonCompletingAutoCompleteTextView) dc31Var.f47418e;
                    if (list != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nonCompletingAutoCompleteTextView3.setAutocompleteEnabled(z);
                    if (list != null) {
                        b38 b38Var2 = g38Var.f76133b;
                        fvy fvyVar5 = hvyVar.f95818g;
                        String str7 = fvyVar5.f73896b;
                        String str8 = fvyVar5.f73897c;
                        String str9 = fvyVar5.f73898d;
                        b38Var2.f22957b = str7;
                        b38Var2.f22958c = str8;
                        b38Var2.f22959d = str9;
                        b38Var2.f22960e = list;
                        b38Var2.notifyDataSetChanged();
                        if (((NonCompletingAutoCompleteTextView) dc31Var.f47418e).hasFocus()) {
                            ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).showDropDown();
                        }
                    } else {
                        ((NonCompletingAutoCompleteTextView) dc31Var.f47418e).dismissDropDown();
                    }
                }
                g38Var.f76141t.m37325b(hvyVar != null);
                g38Var.f76131L0.m37325b((hvyVar != null ? hvyVar.f95814c : null) != null);
                return;
            case 4:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ((zy8) obj3).refreshDrawableState();
                    return;
                }
                return;
            case 5:
                u12 u12Var = ((ulc) obj3).f231507a;
                List list3 = (List) obj2;
                if (wj50.m88271j((List) obj, list3)) {
                    return;
                }
                jo6 jo6Var = (jo6) u12Var.f225650d;
                if (!wj50.m88271j((List) jo6Var.f114335e, list3)) {
                    jo6Var.f114335e = list3;
                    jo6Var.m47712h();
                }
                m500 m500Var = (m500) u12Var.f225652f;
                InputMethodManager inputMethodManager = (InputMethodManager) m500Var.getSystemService("input_method");
                View currentFocus = m500Var.getCurrentFocus();
                if (currentFocus != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    currentFocus.clearFocus();
                }
                boolean z4 = list3.size() < 6;
                ((TextView) ((wg61) u12Var.f225656t).getValue()).setVisibility(z4 ? 4 : 0);
                ((EditText) ((wg61) u12Var.f225655i).getValue()).setEnabled(z4);
                return;
            case 6:
                DateOverlayView dateOverlayView = (DateOverlayView) obj3;
                iin iinVar = dateOverlayView.f6400R0;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue2) {
                    if (!zBooleanValue2) {
                        qr60[] qr60VarArr = DateOverlayView.f6399Y0;
                        dateOverlayView.m16254x();
                        return;
                    }
                    ((TextView) iinVar.f102608d).setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
                    TextView textView2 = (TextView) iinVar.f102606b;
                    textView2.setTextAppearance(R.style.TextAppearance_Encore_TitleSmall);
                    TextView textView3 = (TextView) iinVar.f102609e;
                    textView3.setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
                    int dimensionPixelSize = dateOverlayView.getContext().getResources().getDimensionPixelSize(R.dimen.date_overlay_large_text_distance);
                    ((TextView) iinVar.f102608d).setTranslationY((-dimensionPixelSize) / 2.0f);
                    textView2.setTranslationY(0.0f);
                    textView3.setTranslationY(dimensionPixelSize / 2.0f);
                    TextView textView4 = (TextView) iinVar.f102606b;
                    ColorStateList colorStateList = dateOverlayView.f6403U0;
                    textView4.setTextColor(colorStateList);
                    ((TextView) iinVar.f102608d).setTextColor(colorStateList);
                    ((TextView) iinVar.f102609e).setTextColor(colorStateList);
                    return;
                }
                return;
            case 7:
            default:
                return;
            case 8:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ((z8y) obj3).invalidateSelf();
                    return;
                }
                return;
            case 9:
                l200 l200Var = (l200) obj3;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue3) {
                    if (zBooleanValue3) {
                        om0 om0Var = l200Var.f128862u1;
                        qm0 qm0Var = qm0.FOREGROUNDED;
                        dt0 dt0Var = l200Var.f128860s1;
                        f0p0.m40496W(l200Var, om0Var, qm0Var, dt0Var.f52681a, null, null, dt0Var.f52683c, 12);
                        return;
                    }
                    om0 om0Var2 = l200Var.f128862u1;
                    qm0 qm0Var2 = qm0.BACKGROUNDED;
                    dt0 dt0Var2 = l200Var.f128860s1;
                    f0p0.m40496W(l200Var, om0Var2, qm0Var2, dt0Var2.f52681a, null, null, dt0Var2.f52683c, 12);
                    return;
                }
                return;
            case 10:
                jqz jqzVar = ((j430) obj3).f108570b;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue4 != ((Boolean) obj).booleanValue()) {
                    if (zBooleanValue4) {
                        jqzVar.m54126a(tp20.f222401b);
                        return;
                    } else {
                        if (zBooleanValue4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jqzVar.m54126a(mc40.f142048b);
                        return;
                    }
                }
                return;
            case 11:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                IconAddBadgeView iconAddBadgeView = (IconAddBadgeView) obj3;
                fw40 fw40Var = iconAddBadgeView.f2758a;
                iconAddBadgeView.setAccessibility(zBooleanValue5);
                if (zBooleanValue6 != zBooleanValue5) {
                    ((ImageView) fw40Var.f73935c).setImageState(zBooleanValue5 ? pp91.f179980b : pp91.f179979a, true);
                    if (zBooleanValue5) {
                        ((ImageView) fw40Var.f73935c).setImageTintList(lzj.m60387w(((ImageView) fw40Var.f73934b).getContext(), R.color.green_trailing_icon));
                    } else {
                        ((ImageView) fw40Var.f73935c).setImageTintList(lzj.m60387w(((ImageView) fw40Var.f73934b).getContext(), R.color.gray_trailing_icon));
                    }
                    iconAddBadgeView.refreshDrawableState();
                    return;
                }
                return;
            case 12:
                IconRemoveBadgeView iconRemoveBadgeView = (IconRemoveBadgeView) obj3;
                azu0 azu0Var = iconRemoveBadgeView.f2761a;
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue7) {
                    if (zBooleanValue7) {
                        ((ImageView) azu0Var.f21691c).setVisibility(0);
                        ((ImageView) azu0Var.f21691c).setImageTintList(lzj.m60387w(((ImageView) azu0Var.f21690b).getContext(), R.color.gray_trailing_icon));
                    } else {
                        ((ImageView) azu0Var.f21691c).setVisibility(8);
                    }
                    iconRemoveBadgeView.refreshDrawableState();
                    return;
                }
                return;
            case 13:
                sj70 sj70Var = (sj70) obj2;
                if (!wj50.m88271j((sj70) obj, sj70Var) || sj70Var == null) {
                    uj70 uj70Var = (uj70) obj3;
                    rb5 rb5Var = uj70Var.f230920b;
                    Context context = uj70Var.f230921c;
                    if (context != null) {
                        ((Scheduler) rb5Var.f197471b).mo23384c(new wj70(new ne30(15, sj70Var, uj70Var), rb5Var, context));
                        return;
                    } else {
                        wj50.m88260d0("context");
                        throw null;
                    }
                }
                return;
            case 14:
                if (((Number) obj).floatValue() == ((Number) obj2).floatValue()) {
                    return;
                }
                ((MainLayoutConstrainedContainerView) obj3).requestLayout();
                return;
            case 15:
                float fFloatValue = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                ((MainLayoutFragmentContainerView) obj3).setOutlineProvider(fFloatValue > 0.0f ? new kmx0(fFloatValue, fFloatValue, 0.0f, 0.0f) : ViewOutlineProvider.BACKGROUND);
                return;
            case 16:
                if (wj50.m88271j(obj, obj2)) {
                    return;
                }
                ((qe70) obj3).invoke(obj2);
                return;
            case 17:
                cxb0 cxb0Var = (cxb0) obj2;
                cxb0 cxb0Var2 = (cxb0) obj;
                if (wj50.m88271j(cxb0Var2, cxb0Var)) {
                    return;
                }
                fxb0 fxb0Var = (fxb0) obj3;
                if (fxb0Var.f74328e) {
                    return;
                }
                if (cxb0Var instanceof axb0) {
                    axb0 axb0Var = (axb0) cxb0Var;
                    boolean z5 = axb0Var.f20834b;
                    uek0 uek0Var = axb0Var.f20833a;
                    C2042k7 c2042k7 = new C2042k7(zvb0.f286676h, z3 ? 1 : 0);
                    while (c2042k7.hasNext()) {
                        zvb0 zvb0Var = (zvb0) c2042k7.next();
                        if (zvb0Var.f286677a == uek0Var && zvb0Var.f286678b != z5) {
                            fxb0.f74321h.getClass();
                            if (cxb0Var2 instanceof axb0) {
                                z2 = ((axb0) cxb0Var2).f20834b;
                            } else {
                                if (!(cxb0Var2 instanceof bxb0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z2 = true;
                            }
                            fxb0.m42998a(fxb0Var, zvb0Var, null, z2 || z5, 2);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (!(cxb0Var instanceof bxb0)) {
                    throw new NoWhenBranchMatchedException();
                }
                float fM63436m = n0e1.m63436m(((bxb0) cxb0Var).f31816a, 0.0f, 1.0f);
                if (fxb0Var.f74324a.isLaidOut()) {
                    zwb0 zwb0Var = fxb0Var.f74330g;
                    if (zwb0Var == null) {
                        mg41 mg41Var = fxb0Var.f74327d;
                        if (mg41Var != null) {
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
                            }
                            if (mg41Var.f143321f) {
                                mg41Var.m61689b(true);
                            }
                        }
                        ArrayList arrayListM43000b = fxb0Var.m43000b();
                        zvb0 zvb0Var2 = zvb0.f286671c;
                        zvb0 zvb0Var3 = zvb0.f286672d;
                        Set setM29624m1 = bk5.m29624m1(new zvb0[]{zvb0Var2, zvb0Var3});
                        Iterator it3 = fxb0Var.f74326c.iterator();
                        while (it3.hasNext()) {
                            ((awb0) it3.next()).mo27297d(setM29624m1);
                        }
                        fxb0.m42999e(arrayListM43000b);
                        zwb0Var = new zwb0(fxb0Var.m43001c(zvb0Var2), fxb0Var.m43001c(zvb0Var3));
                        fxb0Var.f74330g = zwb0Var;
                    }
                    fxb0.m42999e(i091.m49320B(zwb0Var.f286957a, zwb0Var.f286958b, fM63436m));
                    return;
                }
                return;
            case 18:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                hak0 hak0Var = (hak0) obj3;
                int iIntValue2 = iIntValue - ((Number) hak0Var.f89235c.getValue()).intValue();
                sx4 sx4Var2 = hak0Var.f89236d;
                ViewGroup.LayoutParams layoutParams = sx4Var2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = iIntValue2;
                sx4Var2.setLayoutParams(marginLayoutParams);
                int childCount = sx4Var2.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = sx4Var2.getChildAt(i4);
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = iIntValue2;
                    childAt.setLayoutParams(marginLayoutParams2);
                }
                return;
            case 19:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                f0p0 f0p0Var = (f0p0) obj3;
                f0p0Var.f64698p1 = f0p0Var.f64698p1 || zBooleanValue8;
                return;
            case 20:
                z3p0 z3p0Var = (z3p0) obj2;
                if (z3p0Var != null) {
                    ((e4p0) obj3).mo35353w(z3p0Var);
                    return;
                }
                return;
            case 21:
                ScrollableContentWithHeaderLayout scrollableContentWithHeaderLayout = (ScrollableContentWithHeaderLayout) obj3;
                boolean zBooleanValue9 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue9) {
                    float measuredHeight = zBooleanValue9 ? scrollableContentWithHeaderLayout.getMeasuredHeight() : 0.0f;
                    Iterator it4 = scrollableContentWithHeaderLayout.getContentChildren().iterator();
                    while (it4.hasNext()) {
                        ((View) it4.next()).setTranslationY(measuredHeight);
                    }
                    scrollableContentWithHeaderLayout.invalidate();
                    return;
                }
                return;
            case 22:
                ((d631) obj3).f45562b.m97090l(g6f.m43745s0((List) obj2));
                return;
            case 23:
                j251 j251Var = (j251) obj3;
                i251 i251Var = (i251) obj2;
                i251 i251Var2 = (i251) obj;
                if (wj50.m88271j(i251Var2, i251Var)) {
                    return;
                }
                boolean z6 = i251Var2.f97748b;
                boolean z7 = i251Var2.f97749c;
                boolean z8 = i251Var.f97748b;
                int i5 = i251Var.f97747a;
                boolean z9 = i251Var.f97749c;
                if (z6 != z8) {
                    if (z8) {
                        e1e0 e1e0Var = j251Var.f107930c;
                        if (e1e0Var == null) {
                            wj50.m88260d0("listener");
                            throw null;
                        }
                        e1e0Var.m37551a(j251Var.m52191b().m939g1());
                    } else {
                        if (z8) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e1e0 e1e0Var2 = j251Var.f107930c;
                        if (e1e0Var2 == null) {
                            wj50.m88260d0("listener");
                            throw null;
                        }
                        e1e0Var2.m37552b(j251Var.m52191b().m939g1(), i251Var.f97750d);
                    }
                }
                if (!z7 && z9 && !i251Var.f97748b && i5 != 0) {
                    e1e0 e1e0Var3 = j251Var.f107930c;
                    if (e1e0Var3 == null) {
                        wj50.m88260d0("listener");
                        throw null;
                    }
                    if (e1e0Var3.m37553c()) {
                        return;
                    }
                    e1e0Var3.m37556f(0L);
                    return;
                }
                if (z7 && !z9 && i5 != 0) {
                    e1e0 e1e0Var4 = j251Var.f107930c;
                    if (e1e0Var4 != null) {
                        e1e0Var4.m37557g();
                        return;
                    } else {
                        wj50.m88260d0("listener");
                        throw null;
                    }
                }
                if (i251Var2.m49450b() != i251Var.m49450b() && i251Var.m49450b()) {
                    e1e0 e1e0Var5 = j251Var.f107930c;
                    if (e1e0Var5 != null) {
                        e1e0Var5.m37557g();
                        return;
                    } else {
                        wj50.m88260d0("listener");
                        throw null;
                    }
                }
                if (i251Var2.m49450b() != i251Var.m49450b()) {
                    e1e0 e1e0Var6 = j251Var.f107930c;
                    if (e1e0Var6 != null) {
                        e1e0Var6.m37556f(1600L);
                        return;
                    } else {
                        wj50.m88260d0("listener");
                        throw null;
                    }
                }
                return;
            case 24:
                ejd1 ejd1Var = (ejd1) obj3;
                WeakReference weakReference = (WeakReference) obj2;
                WeakReference weakReference2 = (WeakReference) obj;
                if (weakReference2 != null && (ajd1Var2 = (ajd1) weakReference2.get()) != null) {
                    ajd1Var2.f16253g = null;
                }
                if (weakReference != null && (ajd1Var = (ajd1) weakReference.get()) != null) {
                    ajd1Var.f16253g = ejd1Var;
                }
                ejd1.m39174a(ejd1Var);
                return;
        }
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: b */
    public void mo39515b() {
        switch (this.f175921b) {
            case 7:
                if (((nxq) this.f175922c).f159555a) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc0(Object obj, int i) {
        super(null);
        this.f175921b = i;
        this.f175922c = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(IconAddBadgeView iconAddBadgeView) {
        this.f175921b = 11;
        Boolean bool = Boolean.FALSE;
        this.f175922c = iconAddBadgeView;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(IconRemoveBadgeView iconRemoveBadgeView) {
        this.f175921b = 12;
        Boolean bool = Boolean.TRUE;
        this.f175922c = iconRemoveBadgeView;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(ScrollableContentWithHeaderLayout scrollableContentWithHeaderLayout) {
        this.f175921b = 21;
        Boolean bool = Boolean.FALSE;
        this.f175922c = scrollableContentWithHeaderLayout;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(AdditionalInfoView additionalInfoView) {
        super(lau.f131415a);
        this.f175921b = 1;
        this.f175922c = additionalInfoView;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(MainLayoutConstrainedContainerView mainLayoutConstrainedContainerView) {
        this.f175921b = 14;
        Float fValueOf = Float.valueOf(1.0f);
        this.f175922c = mainLayoutConstrainedContainerView;
        super(fValueOf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(MainLayoutFragmentContainerView mainLayoutFragmentContainerView) {
        this.f175921b = 15;
        Float fValueOf = Float.valueOf(0.0f);
        this.f175922c = mainLayoutFragmentContainerView;
        super(fValueOf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(DateOverlayView dateOverlayView) {
        this.f175921b = 6;
        Boolean bool = Boolean.FALSE;
        this.f175922c = dateOverlayView;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pc0(Object obj, gh00 gh00Var) {
        super(obj);
        this.f175921b = 16;
        this.f175922c = (qe70) gh00Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(sc0 sc0Var) {
        this.f175921b = 0;
        Boolean bool = Boolean.FALSE;
        this.f175922c = sc0Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(sx4 sx4Var) {
        this.f175921b = 2;
        Boolean bool = Boolean.FALSE;
        this.f175922c = sx4Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(zy8 zy8Var) {
        this.f175921b = 4;
        Boolean bool = Boolean.FALSE;
        this.f175922c = zy8Var;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(ulc ulcVar) {
        super(lau.f131415a);
        this.f175921b = 5;
        this.f175922c = ulcVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(z8y z8yVar) {
        this.f175921b = 8;
        Boolean bool = Boolean.TRUE;
        this.f175922c = z8yVar;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(j430 j430Var) {
        this.f175921b = 10;
        Boolean bool = Boolean.FALSE;
        this.f175922c = j430Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pc0(f0p0 f0p0Var) {
        this.f175921b = 19;
        Boolean bool = Boolean.FALSE;
        this.f175922c = f0p0Var;
        super(bool);
    }
}
