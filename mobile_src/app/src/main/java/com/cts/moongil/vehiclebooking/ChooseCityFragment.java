package com.cts.moongil.vehiclebooking;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import moongil.cts.com.moongil.R;

public class ChooseCityFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private RecyclerView stateCityList;
    private StateCityListAdapter adapter;

    public ChooseCityFragment() {
    }

    public static ChooseCityFragment newInstance(String param1, String param2) {
        ChooseCityFragment fragment = new ChooseCityFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_choose_city, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        stateCityList = (RecyclerView) view.findViewById(R.id.statecitylist);
        adapter = new StateCityListAdapter();
        stateCityList.setAdapter(adapter);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    private class StateCityListAdapter extends RecyclerView.Adapter<StateCityViewHolder> {

        @Override
        public StateCityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(StateCityViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class StateCityViewHolder extends RecyclerView.ViewHolder {
        public StateCityViewHolder(View itemView) {
            super(itemView);
        }
    }
}
