package p204p;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: p.ze */
/* JADX INFO: loaded from: classes.dex */
public class C2647ze {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f281838c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f281839a;

    /* JADX INFO: renamed from: b */
    public final C2610ye f281840b;

    public C2647ze() {
        this(f281838c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo39305a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f281839a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public s5f1 mo39306b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f281839a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new s5f1(accessibilityNodeProvider, 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo39307c(View view, AccessibilityEvent accessibilityEvent) {
        this.f281839a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo1668d(View view, C2374sf c2374sf) {
        this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
    }

    /* JADX INFO: renamed from: e */
    public void mo39308e(View view, AccessibilityEvent accessibilityEvent) {
        this.f281839a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo39309f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f281839a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo39310g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                C2212of c2212of = (C2212of) list.get(i2);
                if (c2212of.m66803a() == i) {
                    Class cls = c2212of.f164606c;
                    InterfaceC1667ah interfaceC1667ah = c2212of.f164607d;
                    if (interfaceC1667ah != null) {
                        if (cls != null) {
                            try {
                                ikc0.m50942n(cls.getDeclaredConstructor(null).newInstance(null));
                                throw null;
                            } catch (Exception unused) {
                            }
                        }
                        zPerformAccessibilityAction = interfaceC1667ah.mo1561q(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f281839a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public void mo39311h(View view, int i) {
        this.f281839a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo39312i(View view, AccessibilityEvent accessibilityEvent) {
        this.f281839a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2647ze(View.AccessibilityDelegate accessibilityDelegate) {
        this.f281839a = accessibilityDelegate;
        this.f281840b = new C2610ye(this);
    }
}
