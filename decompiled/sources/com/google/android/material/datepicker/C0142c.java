package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;
import java.util.Calendar;
import p204p.adn;
import p204p.dkv0;
import p204p.fyh0;
import p204p.gyh0;
import p204p.hjv0;
import p204p.k3d0;
import p204p.kza1;
import p204p.mm90;
import p204p.o8b;
import p204p.ojv0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0142c extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final ContextThemeWrapper f2120d;

    /* JADX INFO: renamed from: e */
    public final o8b f2121e;

    /* JADX INFO: renamed from: f */
    public final mm90 f2122f;

    /* JADX INFO: renamed from: g */
    public final int f2123g;

    public C0142c(ContextThemeWrapper contextThemeWrapper, o8b o8bVar, mm90 mm90Var) {
        fyh0 fyh0Var = o8bVar.f162755a;
        fyh0 fyh0Var2 = o8bVar.f162756b;
        fyh0 fyh0Var3 = o8bVar.f162758d;
        if (fyh0Var.compareTo(fyh0Var3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (fyh0Var3.compareTo(fyh0Var2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * gyh0.f85630d;
        int dimensionPixelSize2 = k3d0.m55238t1(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.f2120d = contextThemeWrapper;
        this.f2123g = dimensionPixelSize + dimensionPixelSize2;
        this.f2121e = o8bVar;
        this.f2122f = mm90Var;
        m47720w(true);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f2121e.f162760f;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public final long mo1618f(int i) {
        Calendar calendarM57746a = kza1.m57746a(this.f2121e.f162755a.f74745a);
        calendarM57746a.add(2, i);
        calendarM57746a.set(5, 1);
        Calendar calendarM57746a2 = kza1.m57746a(calendarM57746a);
        calendarM57746a2.get(2);
        calendarM57746a2.get(1);
        calendarM57746a2.getMaximum(7);
        calendarM57746a2.getActualMaximum(5);
        calendarM57746a2.getTimeInMillis();
        return calendarM57746a2.getTimeInMillis();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        C0141b c0141b = (C0141b) dkv0Var;
        o8b o8bVar = this.f2121e;
        Calendar calendarM57746a = kza1.m57746a(o8bVar.f162755a.f74745a);
        calendarM57746a.add(2, i);
        fyh0 fyh0Var = new fyh0(calendarM57746a);
        c0141b.f2118S0.setText(fyh0Var.m43107k(c0141b.f50039a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0141b.f2119T0.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m1616a() == null || !fyh0Var.equals(materialCalendarGridView.m1616a().f85631a)) {
            new gyh0(fyh0Var, o8bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m1616a().getClass();
        throw null;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) adn.m25591c(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!k3d0.m55238t1(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0141b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new ojv0(-1, this.f2123g));
        return new C0141b(linearLayout, true);
    }
}
