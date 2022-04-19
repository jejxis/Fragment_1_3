package com.example.fragment_1_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import com.example.fragment_1_3.databinding.FragmentSenderBinding

class SenderFragment : Fragment() {

    lateinit var binding:FragmentSenderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sender, container, false)
        binding = FragmentSenderBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnYes.setOnClickListener {
            val bundle = bundleOf("valueKey" to "Yes")//키: valueKey, 값:Yes
            setFragmentResult("request", bundle)//수신 측 프래그먼트로 전달
        }

        binding.btnNo.setOnClickListener {
            val bundle = bundleOf("valueKey" to "NO")//키: valueKey, 값:NO
            setFragmentResult("request", bundle)//수신 측 프래그먼트로 전달
        }
    }
}