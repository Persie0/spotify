package com.spotify.browse.clientnative.mobius;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p204p.isr;
import p204p.kkc0;
import p204p.nfm;
import p204p.pqm0;
import p204p.wma;

/* JADX INFO: renamed from: com.spotify.browse.clientnative.mobius.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0319c {

    /* JADX INFO: renamed from: a */
    public static final nfm f3117a = new nfm();

    /* JADX INFO: renamed from: a */
    public static final BrowseState.Content m4051a(BrowseState browseState) {
        if (browseState instanceof BrowseState.Content) {
            return (BrowseState.Content) browseState;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Map m4052b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wma wmaVar = (wma) it.next();
            pqm0 pqm0Var = (wmaVar instanceof isr ? (isr) wmaVar : null) != null ? new pqm0(((isr) wmaVar).mo42230b(), wmaVar) : null;
            if (pqm0Var != null) {
                arrayList.add(pqm0Var);
            }
        }
        return kkc0.m56705r0(arrayList);
    }
}
