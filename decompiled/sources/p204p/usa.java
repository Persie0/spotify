package p204p;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class usa extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f233571d;

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: c */
    public void mo39307c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f233571d) {
            case 16:
                super.mo39307c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo39307c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public final void mo1668d(View view, C2374sf c2374sf) {
        int scrollRange;
        switch (this.f233571d) {
            case 0:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m(Button.class.getName());
                break;
            case 1:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 2:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 3:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 4:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 5:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 6:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77988w(view.getContext().getString(R.string.library_search_field_content_description));
                break;
            case 7:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77982q(true);
                break;
            case 8:
                AccessibilityNodeInfo accessibilityNodeInfo = c2374sf.f208417a;
                this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!ogs.m66897i(view)) {
                    c2374sf.f208418b = -1;
                    accessibilityNodeInfo.setParent(null);
                }
                break;
            case 9:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 10:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77982q(true);
                break;
            case 11:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2374sf.f208417a;
                this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "heading");
                break;
            case 12:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c2374sf.f208417a;
                this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "heading");
                c2374sf.m77968b(C2212of.f164591g);
                accessibilityNodeInfo3.setSelected(false);
                break;
            case 13:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c2374sf.f208417a;
                this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2212of.f164592h.f164604a);
                accessibilityNodeInfo4.setLongClickable(false);
                break;
            case 14:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77979n(null);
                break;
            case 15:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 16:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c2374sf.m77978m(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c2374sf.m77986u(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c2374sf.m77968b(C2212of.f164596l);
                        c2374sf.m77968b(C2212of.f164600p);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c2374sf.m77968b(C2212of.f164595k);
                        c2374sf.m77968b(C2212of.f164602r);
                    }
                    break;
                }
                break;
            case 17:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 18:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            case 19:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77982q(true);
                break;
            case 20:
                AccessibilityNodeInfo accessibilityNodeInfo5 = c2374sf.f208417a;
                this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                c2374sf.m77982q(true);
                accessibilityNodeInfo5.setSelected(false);
                c2374sf.m77968b(C2212of.f164591g);
                break;
            case 21:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
            default:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m("android.widget.Button");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: g */
    public boolean mo39310g(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.f233571d) {
            case 16:
                if (super.mo39310g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m401A(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m401A(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m401A(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.mo39310g(view, i, bundle);
        }
    }
}
